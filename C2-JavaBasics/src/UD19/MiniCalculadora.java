package UD19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculadora extends JFrame implements ActionListener {
    private JTextField resultField;
    private JLabel resultLabel;
    private JButton[] numberButtons;
    private JButton sumButton, subtractButton, multiplyButton, divideButton, exitButton, aboutButton;

    public MiniCalculadora() {
        setTitle("MiniCalculadora");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 4));

        resultLabel = new JLabel("Resultado:");
        add(resultLabel);

        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            add(numberButtons[i]);
        }

        sumButton = new JButton("Sumar");
        add(sumButton);
        sumButton.addActionListener(this);

        subtractButton = new JButton("Restar");
        add(subtractButton);
        subtractButton.addActionListener(this);

        multiplyButton = new JButton("Multiplicar");
        add(multiplyButton);
        multiplyButton.addActionListener(this);

        divideButton = new JButton("Dividir");
        add(divideButton);
        divideButton.addActionListener(this);

        exitButton = new JButton("Salir");
        add(exitButton);
        exitButton.addActionListener(this);

        aboutButton = new JButton("About");
        add(aboutButton);
        aboutButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        if (clickedButton == sumButton || clickedButton == subtractButton || clickedButton == multiplyButton || clickedButton == divideButton) {
            performOperation(clickedButton.getText());
        } else if (clickedButton == exitButton) {
            System.exit(0);
        } else if (clickedButton == aboutButton) {
            JOptionPane.showMessageDialog(this, "MiniCalculadora\nAutor: Tú\nVersión: 1.0");
        } else {
            String currentText = resultField.getText();
            String newText = currentText + clickedButton.getText();
            resultField.setText(newText);
        }
    }

    private void performOperation(String operation) {
        String expression = resultField.getText();
        double result = 0;

        // Evaluar la expresión para obtener el resultado
        try {
            result = evaluateExpression(expression);
        } catch (ArithmeticException | NumberFormatException ex) {
            resultField.setText("Error: " + ex.getMessage());
            return;
        }

        resultField.setText(String.valueOf(result));
    }

    private double evaluateExpression(String expression) throws ArithmeticException, NumberFormatException {
        // Dividir la expresión en operandos y operadores
        String[] parts = expression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");

        // Primer operando es el primer número
        double result = Double.parseDouble(parts[0]);

        // Iterar sobre los pares de operador y operando
        for (int i = 1; i < parts.length; i += 2) {
            String operator = parts[i];
            double operand = Double.parseDouble(parts[i + 1]);

            // Realizar la operación correspondiente
            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    if (operand == 0) {
                        throw new ArithmeticException("División por cero");
                    }
                    result /= operand;
                    break;
                default:
                    throw new ArithmeticException("Operador inválido: " + operator);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        new MiniCalculadora();
    }
}

