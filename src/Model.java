
public class Model {
    private Viewer viewer;
    private String temp;
    private String operator;

    private Stack leftOperand;
    private Stack rightOperand;


    public Model(Viewer viewer){
        this.viewer = viewer;
        temp = "";
        leftOperand = new Stack();
        rightOperand = new Stack();
        operator = "";
    }

    public void doAction(String action){

        double result;

        if (action.matches("[0-9]+")){
            switch (action){
                case "1":
                    temp+="1";
                    break;
                case "2":
                    temp+="2";
                    break;
                case "3":
                    temp+="3";
                    break;
                case "4":
                    temp+="4";
                    break;
                case "5":
                    temp+="5";
                    break;
                case "6":
                    temp+="6";
                    break;
                case "7":
                    temp+="7";
                    break;
                case "8":
                    temp+="8";
                    break;
                case "9":
                    temp+="9";
                    break;
                case "0":
                    temp+="0";
                    break;
            }
        }
        else if (!action.equals("Equal")) {
            switch (action){
                case "Plus":
                    if(temp.equals("")){
                        temp = "Enter something";
                    }else{
                        leftOperand.push(Double.parseDouble(temp));
                        operator +="+";
                        temp = "";
                    }
                    break;
                case "Minus":
                    if (temp.equals("")){
                        temp+="-";
                    }else{
                        leftOperand.push(Double.parseDouble(temp));
                        operator +="-";
                        temp = "";
                    }
                    break;
                case "Multiply":
                    if(temp.equals("")){
                        temp = "Enter something";
                    }else{
                        leftOperand.push(Double.parseDouble(temp));
                        operator +="*";
                        temp = "";
                    }
                    break;
                case "Divide":
                    if(temp.equals("")){
                        temp = "Enter something";
                    }else{
                        leftOperand.push(Double.parseDouble(temp));
                        operator +="/";
                        temp = "";
                    }
                    break;
                case "Cancel":
                    temp = "";
                    operator="";
                    leftOperand.stack = new double[10];
                    rightOperand.stack = new double[10];
                    break;
                case "Comma":
                    if (temp.equals("")){
                        temp = "Enter digit first.";
                    }else {
                        temp += ".";
                    }
                    break;
                case "Pow":
                    if (temp.equals("")){
                        temp = "Enter something";
                    }else {
                        leftOperand.push(Double.parseDouble(temp));
                        result = Math.pow(leftOperand.pop(),2);
                        if (result%1==0){
                            temp = ""+(int)result;
                        }else {
                            temp = ""+result;
                        }
                    }
            }
        }
        else{
            if (temp.equals("")){
                temp = "Enter something";
            }else {
                rightOperand.push(Double.parseDouble(temp));
            }
            switch (operator){
                case "+":
                    result =  leftOperand.pop() + rightOperand.pop();
                    if (result%1==0){
                        temp = ""+(int)result;
                    }else {
                        temp = ""+result;
                    }
                    break;
                case "-":
                    result = leftOperand.pop() - rightOperand.pop();
                    if (result%1==0){
                        temp = ""+(int)result;
                    }else {
                        temp = ""+result;
                    }
                    break;
                case "*":
                    result = leftOperand.pop() * rightOperand.pop();
                    if (result%1==0){
                        temp = ""+(int)result;
                    }else {
                        temp = ""+result;
                    }
                    break;
                case "/":
                    double x = rightOperand.pop();
                    if (x!=0){
                        result = leftOperand.pop() / x;
                        if (result%1==0){
                            temp = ""+(int)result;
                        }else {
                            temp = ""+result;
                        }
                    }
                    else{
                        temp = "Error,division by zero";
                    }
                    break;
            }
            operator = "";
        }
        viewer.update(temp);

        if(temp.equals("Error,division by zero") || temp.equals("Enter something") || temp.equals("Enter digit first.")){
            temp = "";
        }

    }
}
