package andriana.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    //creating variables for calculations
    double number, answer;
    int calculation;
    JFrame frame;//Creating object of JFrame class

    // Creating objects of Components
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JButton btnZero = new JButton("0");
    JButton btnOne = new JButton("1");
    JButton btnTwo = new JButton("2");
    JButton btnThree = new JButton("3");
    JButton btnFour = new JButton("4");
    JButton btnFive = new JButton("5");
    JButton btnSix = new JButton("6");
    JButton btnSeven = new JButton("7");
    JButton btnEight = new JButton("8");
    JButton btnNine = new JButton("9");
    JButton btnDot = new JButton(".");
    JButton btnClear = new JButton("C");
    JButton btnDelete = new JButton("DEL");
    JButton btnMul = new JButton("x");
    JButton btnDiv = new JButton("/");
    JButton btnPlus = new JButton("+");
    JButton btnMinus = new JButton("-");
    JButton btnSquare = new JButton("x\u00B2");
    JButton btnReciprocal = new JButton("1/x");
    JButton btnSqrt = new JButton("\u221A");
    JButton btnEqual = new JButton("=");


    Calculator()//Creating constructor of the class
    {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI() {
        frame = new JFrame();
        frame.setTitle("Calculator");//Setting title of the JFrame
        frame.setSize(300, 500);//Setting size
        frame.getContentPane().setLayout(null);//Setting Layout
        frame.getContentPane().setBackground(Color.gray);//Setting Background Color
        frame.setResizable(false);//Preventing window from resizing
        frame.setLocationRelativeTo(null);//Setting location to the center of the screen
        frame.setVisible(true);//Setting window's visibility
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Setting default close operation
    }

    public void addComponents() {
        //Setting property of label
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);

        //Setting property of text field
        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        //Setting property of button 0
        btnZero.setBounds(10, 410, 130, 40);
        btnZero.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(btnZero);

        //Setting property of button 1
        btnOne.setBounds(10, 350, 60, 40);
        btnOne.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(btnOne);

        //Setting property of button 2
        btnTwo.setBounds(80, 350, 60, 40);
        btnTwo.setFont(new Font("Comic Sanas MS", Font.BOLD, 20));
        frame.add(btnTwo);

        //Setting property of button 3
        btnThree.setBounds(150, 350, 60, 40);
        btnThree.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(btnThree);

        //Setting property of button 4
        btnFour.setBounds(10, 290, 60, 40);
        btnFour.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(btnFour);

        //Setting property of button 5
        btnFive.setBounds(80, 290, 60, 40);
        btnFive.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(btnFive);

        //Setting property of button 6
        btnSix.setBounds(150, 290, 60, 40);
        btnSix.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(btnSix);

        //Setting property of button 7
        btnSeven.setBounds(10, 230, 60, 40);
        btnSeven.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(btnSeven);

        // Setting property of button 8
        btnEight.setBounds(80, 230, 60, 40);
        btnEight.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(btnEight);

        //Setting property of button 9
        btnNine.setBounds(150, 230, 60, 40);
        btnNine.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(btnNine);


        //Setting property of button .
        btnDot.setBounds(150, 410, 60, 40);
        btnDot.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(btnDot);

        //Setting property of button =
        btnEqual.setBounds(220, 350, 60, 100);
        btnEqual.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        btnEqual.setBackground(new Color(239, 188, 2));
        frame.add(btnEqual);

        //Setting property of button /
        btnDiv.setBounds(220, 110, 60, 40);
        btnDiv.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        btnDiv.setBackground(new Color(239, 188, 2));
        frame.add(btnDiv);

        //Setting property of button square root
        btnSqrt.setBounds(10, 170, 60, 40);
        btnSqrt.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        frame.add(btnSqrt);

        //Setting property of button X
        btnMul.setBounds(220, 230, 60, 40);
        btnMul.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        btnMul.setBackground(new Color(239, 188, 2));
        frame.add(btnMul);

        //Setting property of button -
        btnMinus.setBounds(220, 170, 60, 40);
        btnMinus.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        btnMinus.setBackground(new Color(239, 188, 2));
        frame.add(btnMinus);

        //Setting property of button +
        btnPlus.setBounds(220, 290, 60, 40);
        btnPlus.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        btnPlus.setBackground(new Color(239, 188, 2));
        frame.add(btnPlus);

        //Setting property of button square
        btnSquare.setBounds(80, 170, 60, 40);
        btnSquare.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(btnSquare);

        //Setting property of reciprocal button
        btnReciprocal.setBounds(150, 170, 60, 40);
        btnReciprocal.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        frame.add(btnReciprocal);

        //Setting property of delete button
        btnDelete.setBounds(150, 110, 60, 40);
        btnDelete.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        btnDelete.setBackground(Color.red);
        btnDelete.setForeground(Color.white);
        frame.add(btnDelete);

        //Setting property of clear button
        btnClear.setBounds(80, 110, 60, 40);
        btnClear.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        btnClear.setBackground(Color.red);
        btnClear.setForeground(Color.white);
        frame.add(btnClear);

    }

    public void addActionEvent(){
        //Registering ActionListener To Buttons
//        onRadioButton.addActionListener(this);
//        offRadioButton.addActionListener(this);
        btnZero.addActionListener(this);
        btnOne.addActionListener(this);
        btnTwo.addActionListener(this);
        btnThree.addActionListener(this);
        btnFour.addActionListener(this);
        btnFive.addActionListener(this);
        btnSix.addActionListener(this);
        btnSeven.addActionListener(this);
        btnEight.addActionListener(this);
        btnNine.addActionListener(this);
        btnDot.addActionListener(this);
        btnMul.addActionListener(this);
        btnMinus.addActionListener(this);
        btnDiv.addActionListener(this);
        btnPlus.addActionListener(this);
        btnReciprocal.addActionListener(this);
        btnSqrt.addActionListener(this);
        btnSquare.addActionListener(this);
        btnClear.addActionListener(this);
        btnDelete.addActionListener(this);
        btnEqual.addActionListener(this);
    }

    //Overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent b){
        Object source = b.getSource();
//        if (source == onRadioButton) {
//            enable();//Calling enable() function
//        } else if (source == offRadioButton) {
//            disable();//Calling disable function
//        }
//        else
       if (source == btnClear){
            label.setText("");
            textField.setText("");
        }else if(source ==btnDelete){
            int length = textField.getText().length();
            int number = length - 1;

            if(length > 0){
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }

            if(textField.getText().endsWith("")){
                label.setText("");
            }
        }else if(source == btnZero){
            if(textField.getText().equals("0")){
                return;
            }else{
                textField.setText(textField.getText() + "0");
            }
        }else if(source == btnOne){
            textField.setText(textField.getText() + "1");
        }else if(source == btnTwo){
            textField.setText(textField.getText() + "2");
            btnTwo.setEnabled(true);
        }else if(source == btnThree){
            textField.setText(textField.getText() + "3");
        }else if(source == btnFour){
            textField.setText(textField.getText() + "4");
        }else if(source == btnFive){
            textField.setText(textField.getText() + "5");
        }else if(source == btnSix){
            textField.setText(textField.getText() + "6");
        }else if(source == btnSeven){
            textField.setText(textField.getText() + "7");
        }else if(source == btnEight){
            textField.setText(textField.getText() + "8");
        }else if(source == btnNine){
            textField.setText(textField.getText() + "9");
        }else if(source == btnDot){
            if (textField.getText().contains(".")){
                return;
            }else {
                textField.setText(textField.getText() + ".");
            }
        }else if (source==btnPlus){
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;
        }else if(source == btnMinus){
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        }else if(source == btnMul){
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculation = 3;
        }else if(source == btnDiv){
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;
        }else if(source == btnSqrt){
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));
        }else if(source == btnSquare){
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if(string.endsWith(".0")){
                textField.setText(string.replace(".0", ""));
            }else{
                textField.setText(string);
            }
            label.setText("(sqr)" + str);
        }else if(source == btnReciprocal){
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1/ number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")){
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        }else if(source == btnEqual){
            //setting for equal button
            switch (calculation){
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")){
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    }else{
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if(Double.toString(answer).endsWith(".0")){
                        textField.setText(Double.toString(answer).replace(".0",""));
                    }else{
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if(Double.toString(answer).endsWith(".0")){
                        textField.setText(Double.toString(answer).replace(".0",""));
                    }else{
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if(Double.toString(answer).endsWith(".0")){
                        textField.setText(Double.toString(answer).replace(".0",""));
                    }else{
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
            }
        }
    }


    public static void main(String[] args) {
        new Calculator();
    }
}
