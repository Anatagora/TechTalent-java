package UD22_MVC.Ejercicio3.Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import UD22_MVC.Ejercicio3.Controller.AsignadoAController;
import UD22_MVC.Ejercicio3.Modelo.Proyecto;

public class CrearAsignadoAView extends JFrame {
    private JComboBox<String> proyectoComboBox;
    private JComboBox<String> asignadoAComboBox;
    private JButton submitButton;

    public CrearAsignadoAView() {
        setTitle("Agregar Asignación");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Seleccionar Proyecto:"));
        proyectoComboBox = new JComboBox<>();
        cargarProyectos();
        panel.add(proyectoComboBox);

        panel.add(new JLabel("Seleccionar Científico:"));
        asignadoAComboBox = new JComboBox<>();
        cargarCientificos();
        panel.add(asignadoAComboBox);

        submitButton = new JButton("Agregar");
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idProyecto = proyectoComboBox.getSelectedItem().toString();
                String DNI = asignadoAComboBox.getSelectedItem().toString();
                AsignadoAController controller = new AsignadoAController();
                controller.addAsignadoA(idProyecto, DNI);
                JOptionPane.showMessageDialog(null, "Asignación agregada exitosamente!");
                dispose();
            }
        });

        add(panel);
    }

    private void cargarProyectos() {
        // Código para cargar los nombres de los proyectos en el JComboBox
    }

    private void cargarCientificos() {
        // Código para cargar los DNI de los científicos en el JComboBox
    }
}

