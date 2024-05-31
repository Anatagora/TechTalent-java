package UD22_MVC.Ejercicio3.Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import UD22_MVC.Ejercicio3.Controller.CientificoController;

public class ActualizarCientificoView extends JFrame {
    private JTextField dniField;
    private JTextField nombreField;
    private JButton submitButton;

    public ActualizarCientificoView() {
        setTitle("Actualizar Científico");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Disposes only this window
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("DNI:"));
        dniField = new JTextField(20);
        panel.add(dniField);

        panel.add(new JLabel("Nuevo Nombre y Apellidos:"));
        nombreField = new JTextField(20);
        panel.add(nombreField);

        submitButton = new JButton("Actualizar");
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dni = dniField.getText();
                String nuevoNombre = nombreField.getText();
                CientificoController controller = new CientificoController();
                controller.updateCientifico(dni, nuevoNombre);
                JOptionPane.showMessageDialog(null, "Científico actualizado exitosamente!");
                dispose();  // Close this window after action
            }
        });

        add(panel);
    }
}


