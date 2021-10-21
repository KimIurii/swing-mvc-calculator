public class Stack {
    double[] stack = new double[10];
    int tos;

    Stack(){
        tos = -1;
    }

    void push(double item){
        if(tos==9){
            System.out.println("Stack is full");
        }else{
            stack[++tos] = item;
        }
    }

    double pop(){
        if (tos<0){
            System.out.println("Stack is empty");
            return 0;
        }else{
            return stack[tos--];
        }
    }
}
