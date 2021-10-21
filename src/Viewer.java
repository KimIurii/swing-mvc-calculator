import javax.swing.*;
import java.awt.*;

public class Viewer {
    private JTextField textField;
    private Font font;
    public Viewer() {

        Controller controller = new Controller(this);
        font = new Font("Bernard MT Condensed", Font.PLAIN, 15);
        textField = initTextField();

        /*
            Initialize first column of buttons (digits)
         */
        JButton buttonSeven = new JButton("7");
        buttonSeven.setBounds(50, 50, 50, 50);
        buttonSeven.setFont(font);
        buttonSeven.setForeground(java.awt.Color.RED);
        buttonSeven.addActionListener(controller);
        buttonSeven.setActionCommand("7");

        JButton buttonFour = new JButton("4");
        buttonFour.setBounds(50,110,50,50);
        buttonFour.setFont(font);
        buttonFour.setForeground(java.awt.Color.RED);
        buttonFour.addActionListener(controller);
        buttonFour.setActionCommand("4");

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(50,170,50,50);
        buttonOne.setFont(font);
        buttonOne.setForeground(java.awt.Color.RED);
        buttonOne.addActionListener(controller);
        buttonOne.setActionCommand("1");

        JButton buttonZero = new JButton("0");
        buttonZero.setBounds(50,230,50,50);
        buttonZero.setFont(font);
        buttonZero.setForeground(Color.RED);
        buttonZero.addActionListener(controller);
        buttonZero.setActionCommand("0");

        /*
            Initialize second column of buttons (digits)
        */
        JButton buttonEight = new JButton("8");
        buttonEight.setBounds(110, 50, 50, 50);
        buttonEight.setFont(font);
        buttonEight.setForeground(java.awt.Color.RED);
        buttonEight.addActionListener(controller);
        buttonEight.setActionCommand("8");

        JButton buttonFive = new JButton("5");
        buttonFive.setBounds(110,110,50,50);
        buttonFive.setFont(font);
        buttonFive.setForeground(java.awt.Color.RED);
        buttonFive.addActionListener(controller);
        buttonFive.setActionCommand("5");

        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(110,170,50,50);
        buttonTwo.setFont(font);
        buttonTwo.setForeground(java.awt.Color.RED);
        buttonTwo.addActionListener(controller);
        buttonTwo.setActionCommand("2");

        JButton buttonComma = new JButton(",");
        buttonComma.setBounds(110,230,50,50);
        buttonComma.setFont(font);
        buttonComma.setForeground(Color.RED);
        buttonComma.addActionListener(controller);
        buttonComma.setActionCommand("Comma");
        /*
            Initialize third column of buttons(digits)
        */
        JButton buttonNine = new JButton("9");
        buttonNine.setBounds(170, 50, 50, 50);
        buttonNine.setFont(font);
        buttonNine.setForeground(java.awt.Color.RED);
        buttonNine.addActionListener(controller);
        buttonNine.setActionCommand("9");

        JButton buttonSix = new JButton("6");
        buttonSix.setBounds(170,110,50,50);
        buttonSix.setFont(font);
        buttonSix.setForeground(Color.RED);
        buttonSix.addActionListener(controller);
        buttonSix.setActionCommand("6");

        JButton buttonThree = new JButton("3");
        buttonThree.setBounds(170,170,50,50);
        buttonThree.setFont(font);
        buttonThree.setForeground(Color.RED);
        buttonThree.addActionListener(controller);
        buttonThree.setActionCommand("3");

        /*
            Initialize third column of buttons
        */
        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(50,290,230,50);
        buttonEqual.setFont(font);
        buttonEqual.setForeground(java.awt.Color.RED);
        buttonEqual.addActionListener(controller);
        buttonEqual.setActionCommand("Equal");

        JButton buttonAddition = new JButton("+");
        buttonAddition.setBounds(230,50,50,50);
        buttonAddition.setForeground(Color.RED);
        buttonAddition.addActionListener(controller);
        buttonAddition.setActionCommand("Plus");

        JButton buttonSubtraction = new JButton("-");
        buttonSubtraction.setBounds(230,110,50,50);
        buttonSubtraction.setForeground(Color.RED);
        buttonSubtraction.addActionListener(controller);
        buttonSubtraction.setActionCommand("Minus");

        JButton buttonMultiplication = new JButton("*");
        buttonMultiplication.setBounds(230,170,50,50);
        buttonMultiplication.setForeground(Color.RED);
        buttonMultiplication.addActionListener(controller);
        buttonMultiplication.setActionCommand("Multiply");

        JButton buttonDivison = new JButton("/");
        buttonDivison.setBounds(230,230,50,50);
        buttonDivison.setForeground(Color.RED);
        buttonDivison.addActionListener(controller);
        buttonDivison.setActionCommand("Divide");

        JButton buttonCancel = new JButton(">>");
        buttonCancel.setBounds(1,10,45,30);
        buttonCancel.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 5));
        buttonCancel.addActionListener(controller);
        buttonCancel.setActionCommand("Cancel");

        JButton buttonPow = new JButton("^");
        buttonPow.setBounds(170, 230, 50, 50);
        buttonPow.setFont(font);
        buttonPow.setForeground(Color.RED);
        buttonPow.addActionListener(controller);
        buttonPow.setActionCommand("Pow");

        /*
            Initialize JFrame and adding components
        */
        JFrame frame = initJFrame();
        frame.add(textField);
        frame.add(buttonSeven);
        frame.add(buttonFour);
        frame.add(buttonOne);
        frame.add(buttonZero);

        frame.add(buttonEight);
        frame.add(buttonFive);
        frame.add(buttonTwo);

        frame.add(buttonNine);
        frame.add(buttonSix);
        frame.add(buttonThree);
        
        frame.add(buttonEqual);
        frame.add(buttonComma);
        frame.add(buttonAddition);
        frame.add(buttonSubtraction);
        frame.add(buttonMultiplication);
        frame.add(buttonDivison);
        frame.add(buttonCancel);
        frame.add(buttonPow);
    }

    private JFrame initJFrame(){
        JFrame frame = new JFrame("Calculator MVC");
        frame.setSize(320, 380);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        return frame;
    }

    private JTextField initTextField(){
        textField = new JTextField();
        textField.setBounds(50, 10, 230, 30);
        textField.setFont(font);
        textField.setForeground(java.awt.Color.RED);
        return  textField;
    }

    public void update(String text){
        textField.setText(text);
    }
}
