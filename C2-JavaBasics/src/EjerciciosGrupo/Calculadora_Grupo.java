package EjerciciosGrupo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Calculadora_Grupo extends JFrame {

    private JTextField inputScreen;
    private JTextArea historyArea;
    private JLabel resultLabel;
    private String num1 = "";
    private String op = "";
    private boolean startNumber = true;
    private List<String> historyList = new ArrayList<>();
    private double lastResult = 0.0; // Para guardar el último resultado

    public Calculadora_Grupo() {
        createUI();
    }

    private void createUI() {
        this.setTitle("Calculadora Espacial");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1, 3));

        // Primer Panel: Solo imagen
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());

        JLabel imageLabel = new JLabel();
        try {
            BufferedImage img = ImageIO.read(new File(
                    "C:\\Users\\Santos\\Desktop\\RepositoriTechTalent\\Eclipse\\Calculadora\\src\\calculadora\\Logo.png")); // Ruta
            // de
            // la
            // imagen
            // del
            // panel
            // 1
            ImageIcon icon = new ImageIcon(img.getScaledInstance(250, 250, Image.SCALE_SMOOTH));
            imageLabel.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Agregar la imagen al panel
        panel1.add(imageLabel, BorderLayout.CENTER);
        this.add(panel1);

        // Segundo Panel: Historial
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        historyArea = new JTextArea();
        historyArea.setEditable(false);
        historyArea.setFont(new Font("Arial", Font.PLAIN, 24)); // Tamaño de la fuente del historial
        JScrollPane scrollPane = new JScrollPane(historyArea);
        scrollPane.setPreferredSize(new Dimension(10, 10));
        panel2.add(scrollPane, BorderLayout.CENTER);
        this.add(panel2);

        // Tercer Panel: Calculadora y Resultado Actual
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());

        inputScreen = new JTextField();
        inputScreen.setEditable(false);
        inputScreen.setHorizontalAlignment(JTextField.RIGHT);
        inputScreen.setFont(new Font("Arial", Font.PLAIN, 24));

        resultLabel = new JLabel("", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 34));
        resultLabel.setForeground(Color.RED); // Color del texto en rojo

        JPanel calculatorPanel = new JPanel();
        calculatorPanel.setLayout(new GridLayout(6, 4, 1, 1));
        String[] buttons = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "C", "⌫", "=", "+", "Ans", "^" };

        for (String b : buttons) {
            JButton button;
            if ("C".equals(b)) {
                try {
                    BufferedImage img = ImageIO.read(new File(
                            "C:\\Users\\Santos\\Desktop\\RepositoriTechTalent\\Eclipse\\Calculadora\\src\\calculadora\\C.png")); // Ruta
                    // de
                    // la
                    // imagen
                    // del
                    // botón
                    // C
                    ImageIcon icon = new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                    button = new JButton(icon);
                } catch (IOException e) {
                    e.printStackTrace();
                    button = new JButton(b);
                }
            } else if ("=".equals(b)) {
                try {
                    BufferedImage img = ImageIO.read(new File(
                            "C:\\Users\\Santos\\Desktop\\RepositoriTechTalent\\Eclipse\\Calculadora\\src\\calculadora\\=.png")); // Ruta
                    // de
                    // la
                    // imagen
                    // del
                    // botón
                    // igual
                    ImageIcon icon = new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                    button = new JButton(icon);
                } catch (IOException e) {
                    e.printStackTrace();
                    button = new JButton(b);
                }
            } else if ("+".equals(b)) {
                try {
                    BufferedImage img = ImageIO.read(new File(
                            "C:\\Users\\Santos\\Desktop\\RepositoriTechTalent\\Eclipse\\Calculadora\\src\\calculadora\\+.png")); // Ruta
                    // de
                    // la
                    // imagen
                    // del
                    // botón
                    // suma
                    ImageIcon icon = new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                    button = new JButton(icon);
                } catch (IOException e) {
                    e.printStackTrace();
                    button = new JButton(b);
                }
            } else if ("-".equals(b)) {
                try {
                    BufferedImage img = ImageIO.read(new File(
                            "C:\\Users\\Santos\\Desktop\\RepositoriTechTalent\\Eclipse\\Calculadora\\src\\calculadora\\resta.png")); // Ruta
                    // de
                    // la
                    // imagen
                    // del
                    // botón
                    // resta
                    ImageIcon icon = new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                    button = new JButton(icon);
                } catch (IOException e) {
                    e.printStackTrace();
                    button = new JButton(b);
                }
            } else if ("*".equals(b)) {
                try {
                    BufferedImage img = ImageIO.read(new File("C:\\Users\\Santos\\Desktop\\RepositoriTechTalent\\Eclipse\\Calculadora\\src\\calculadora\\X.png")); // Ruta
                    // de
                    // la
                    // imagen
                    // del
                    // botón
                    // multiplicación
                    ImageIcon icon = new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                    button = new JButton(icon);
                } catch (IOException e) {
                    e.printStackTrace();
                    button = new JButton(b);
                }
            } else if ("/".equals(b)) {
                try {
                    BufferedImage img = ImageIO.read(new File("C:\\Users\\Santos\\Desktop\\RepositoriTechTalent\\Eclipse\\Calculadora\\src\\calculadora\\division.png")); // Ruta
                    // de
                    // la
                    // imagen
                    // del
                    // botón
                    // división
                    ImageIcon icon = new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                    button = new JButton(icon);
                } catch (IOException e) {
                    e.printStackTrace();
                    button = new JButton(b);
                }
            } else if (".".equals(b)) {
                try {
                    BufferedImage img = ImageIO.read(new File("C:\\Users\\Santos\\Desktop\\RepositoriTechTalent\\Eclipse\\Calculadora\\src\\calculadora\\..png")); // Ruta
                    // de
                    // la
                    // imagen
                    // del
                    // botón
                    // punto
                    ImageIcon icon = new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                    button = new JButton(icon);
                } catch (IOException e) {
                    e.printStackTrace();
                    button = new JButton(b);
                }
            } else if ("0".equals(b)) {
                try {
                    BufferedImage img = ImageIO.read(new File(
                            "C:\\Users\\Santos\\Desktop\\RepositoriTechTalent\\Eclipse\\Calculadora\\src\\calculadora\\0.png")); // Ruta
                    // de
                    // la
                    // imagen
                    // del
                    // botón
                    // 0
                    ImageIcon icon = new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                    button = new JButton(icon);
                } catch (IOException e) {
                    e.printStackTrace();
                    button = new JButton(b);
                }
            } else if ("Ans".equals(b)) {
                try {
                    BufferedImage img = ImageIO.read(new File(
                            "C:\\Users\\Santos\\Desktop\\RepositoriTechTalent\\Eclipse\\Calculadora\\src\\calculadora\\ans.png")); // Ruta
                    // de
                    // la
                    // imagen
                    // del
                    // botón
                    // ans
                    ImageIcon icon = new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                    button = new JButton(icon);
                } catch (IOException e) {
                    e.printStackTrace();
                    button = new JButton(b);
                }
            } else if ("^".equals(b)) {
                try {
                    BufferedImage img = ImageIO.read(new File(
                            "C:\\Users\\Santos\\Desktop\\RepositoriTechTalent\\Eclipse\\Calculadora\\src\\calculadora\\pow.png")); // Ruta
                    // de
                    // la
                    // imagen
                    // del
                    // botón
                    // exponente
                    ImageIcon icon = new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
                    button = new JButton(icon);
                } catch (IOException e) {
                    e.printStackTrace();
                    button = new JButton(b);
                }
            } else {
                button = new JButton(b);
            }
            button.addActionListener(e -> {
                if ("0123456789".contains(b) || ".".equals(b)) {
                    handleNumberButton(b);
                } else if ("+-*/".contains(b) || "^".equals(b)) {
                    handleOperatorButton(b);
                } else if ("=".equals(b)) {
                    handleEqualsButton();
                } else if ("C".equals(b)) {
                    handleClearButton();
                } else if ("⌫".equals(b)) {
                    handleBackspaceButton();
                } else if ("Ans".equals(b)) {
                    handleAnsButton();
                }
            });
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            calculatorPanel.add(button);
        }

        panel3.add(inputScreen, BorderLayout.NORTH);
        panel3.add(calculatorPanel, BorderLayout.CENTER);
        panel3.add(resultLabel, BorderLayout.SOUTH);
        this.add(panel3);

        // Configuración de la ventana
        this.setSize(800, 300); // Ajusta el tamaño de la ventana según tus necesidades
        this.setVisible(true);
    }

    private void handleNumberButton(String number) {
        if (startNumber) {
            inputScreen.setText(number);
        } else {
            inputScreen.setText(inputScreen.getText() + number);
        }
        startNumber = false;
        
    }

    private void handleOperatorButton(String operator) {
        num1 = inputScreen.getText();
        op = operator;
        startNumber = true;
    }

    private void handleEqualsButton() {
        if (!op.isEmpty()) {
            double num2 = Double.parseDouble(inputScreen.getText());
            double result = calculate(Double.parseDouble(num1), num2, op);

            // Clear the input screen after calculation
            inputScreen.setText("");

            lastResult = result; // Guardar el resultado calculado
            historyList.add(num1 + " " + op + " " + num2 + " = " + result);
            num1 = String.valueOf(result);
            updateHistory();
            updateResult(result);
        }
    }

    private void handleClearButton() {
        inputScreen.setText("0");
        num1 = "";
        op = "";
        startNumber = true;
    }

    private void handleBackspaceButton() {
        String currentText = inputScreen.getText();
        if (!currentText.isEmpty() && !currentText.equals("0")) {
            inputScreen.setText(currentText.substring(0, currentText.length() - 1));
            if (inputScreen.getText().isEmpty()) {
                inputScreen.setText("0");
                startNumber = true;
            }
        }
    }

    private void handleAnsButton() {
        inputScreen.setText(String.valueOf(lastResult));
        startNumber = false;
    }

    private double calculate(double num1, double num2, String op) {
        double result = 0;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    inputScreen.setText("Error");
                }
                break;
            case "^":
                result = Math.pow(num1, num2);
                break;
        }
        return result;
    }

    private void updateHistory() {
        StringBuilder historyText = new StringBuilder();
        for (String entry : historyList) {
            historyText.append(entry).append("\n");
        }
        historyArea.setText(historyText.toString());
    }

    private void updateResult(double result) {
        resultLabel.setText("= " + result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculadora_Grupo::new);
    }
}