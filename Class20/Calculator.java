package Class20;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private double total1 =0.0;
    private double total2 =0.0;
    private double answer;
    private char operator;
    private void getOperator (String ButtonOperator) {
        operator = ButtonOperator.charAt(0);
        total1 = total1 +Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
        }





    private JPanel Calculator;
    private JTextField textDisplay;
    private JButton btnEqual;
    private JButton btnPlus;
    private JButton btnDiv;
    private JButton btnPercentage;
    private JButton btntan;
    private JButton btn9;
    private JButton btn3;
    private JButton btncos;
    private JButton btnProduct;
    private JButton btnMinus;
    private JButton btn6;
    private JButton btn8;
    private JButton btn5;
    private JButton btn2;
    private JButton btnPoint;
    private JButton btnsin;
    private JButton btn7;
    private JButton btn4;
    private JButton btn1;
    private JButton btn0;
    private JButton btnClear;
    private JButton sqrtbtn;
    private JButton π;


    public Calculator() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text = textDisplay.getText()+btn1.getText();
                textDisplay.setText(btn1Text);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn2Text = textDisplay.getText()+btn2.getText();
                textDisplay.setText(btn2Text);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn3Text = textDisplay.getText()+btn3.getText();
                textDisplay.setText(btn3Text);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn4Text = textDisplay.getText()+btn4.getText();
                textDisplay.setText(btn4Text);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn5Text = textDisplay.getText()+btn5.getText();
                textDisplay.setText(btn5Text);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn6Text = textDisplay.getText()+btn6.getText();
                textDisplay.setText(btn6Text);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn7Text = textDisplay.getText()+btn7.getText();
                textDisplay.setText(btn7Text);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String btn8Text = textDisplay.getText() + btn8.getText();
                textDisplay.setText(btn8Text);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn9Text = textDisplay.getText()+btn9.getText();
                textDisplay.setText(btn9Text);
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn0Text = textDisplay.getText()+btn0.getText();
                textDisplay.setText(btn0Text);
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnPointText = textDisplay.getText()+btnPoint.getText();
                textDisplay.setText(btnPointText);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnPlusText = btnPlus.getText();
                getOperator(btnPlusText);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnMinusText = btnMinus.getText();
                getOperator(btnMinusText);
            }
        });
        btnProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnProductText = btnProduct.getText();
                getOperator(btnProductText);
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnDivText = btnDiv.getText();
                getOperator(btnDivText);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator == '+') {
                    total2 = total1 + Double.parseDouble(textDisplay.getText());

                    textDisplay.setText(Double.toString(total2));
                    total1 = 0;
                } else if (operator == '-') {
                    total2 = total1 - Double.parseDouble(textDisplay.getText());

                    textDisplay.setText(Double.toString(total2));
                    total1 = 0;
                } else if (operator == '/') {
                    total2 = total1 / Double.parseDouble(textDisplay.getText());

                    textDisplay.setText(Double.toString(total2));
                    total1 = 0;
                } else if (operator == 'x') {
                    total2 = total1 * Double.parseDouble(textDisplay.getText());

                    textDisplay.setText(Double.toString(total2));
                    total1 = 0;}

                }

        });
        btnPercentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    double ops =Double.parseDouble(String.valueOf(textDisplay.getText()));
                    answer = ops/100;
                    textDisplay.setText(String.valueOf(answer));
            }
        });
        btnsin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
                ops = Math.sin(ops);

                textDisplay.setText(String.valueOf(ops));
            }
        });
        sqrtbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
                ops = Math.sqrt(ops);

                textDisplay.setText(String.valueOf(ops));
            }
        });
        btncos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
                ops = Math.cos(ops);

                textDisplay.setText(String.valueOf(ops));
            }
        });
        btntan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
                ops = Math.tan(ops);

                textDisplay.setText(String.valueOf(ops));
            }
        });
        π.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ops;
                ops = (3.1415926535897932384626433832795);
                textDisplay.setText(String.valueOf(ops));

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
