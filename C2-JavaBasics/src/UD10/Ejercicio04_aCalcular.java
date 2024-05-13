package UD10;

import javax.swing.JOptionPane;

public class Ejercicio04_aCalcular {

    public static void main(String[] args) {
        while (true) {
            String[] opciones = {"Suma", "Resta", "Multiplicación", "División", "Potencia", "Raíz cuadrada", "Raíz cúbica", "Salir"};
            String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:",
                    "Calculadora", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            if (opcionSeleccionada == null || opcionSeleccionada.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                break;
            }

            double resultado;
            try {
                double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
                double num2 = 0;

                if (!opcionSeleccionada.equals("Raíz cuadrada") && !opcionSeleccionada.equals("Raíz cúbica")) {
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
                }

                switch (opcionSeleccionada) {
                    case "Suma":
                        resultado = num1 + num2;
                        break;
                    case "Resta":
                        resultado = num1 - num2;
                        break;
                    case "Multiplicación":
                        resultado = num1 * num2;
                        break;
                    case "División":
                        if (num2 == 0) {
                            JOptionPane.showMessageDialog(null, "No se puede dividir entre cero.");
                            continue;
                        }
                        resultado = num1 / num2;
                        break;
                    case "Potencia":
                        resultado = Math.pow(num1, num2);
                        break;
                    case "Raíz cuadrada":
                        if (num1 < 0) {
                            JOptionPane.showMessageDialog(null, "No se puede calcular la raíz cuadrada de un número negativo.");
                            continue;
                        }
                        resultado = Math.sqrt(num1);
                        break;
                    case "Raíz cúbica":
                        resultado = Math.cbrt(num1);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Operación no válida.");
                        continue;
                }

                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos.");
            }
        }
    }
}

