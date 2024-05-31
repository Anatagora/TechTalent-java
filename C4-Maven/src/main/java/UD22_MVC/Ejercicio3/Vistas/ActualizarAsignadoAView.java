package UD22_MVC.Ejercicio3.Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import UD22_MVC.Ejercicio3.Controller.AsignadoAController;
import UD22_MVC.Ejercicio3.Modelo.AsignadoA;

public class ActualizarAsignadoAView extends JFrame {
    private JComboBox<AsignadoA> asignadoAComboBox;
    private JComboBox<String> proyectoComboBox;
    private JButton submitButton;

    public ActualizarAsignadoAView() {
        setTitle("Actualizar Asignación");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Seleccionar Asignación:"));
        asignadoAComboBox = new JComboBox<>();
        cargarAsignaciones();
        panel.add(asignadoAComboBox);

        panel.add(new JLabel("Nuevo Proyecto:"));
        proyectoComboBox = new JComboBox<>();
        cargarProyectos();
        panel.add(proyectoComboBox);

        submitButton = new JButton("Actualizar");
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AsignadoA asignadoA = (AsignadoA) asignadoAComboBox.getSelectedItem();
                String idProyecto = proyectoComboBox.getSelectedItem().toString();
                AsignadoAController controller = new AsignadoAController();
                controller.updateAsignadoA(asignadoA.getIdProyecto(), asignadoA.getDNI(), idProyecto);
                JOptionPane.showMessageDialog(null, "Asignación actualizada exitosamente!");
                dispose();
            }
        });

        add(panel);
    }

    private void cargarAsignaciones() {
        // Código para cargar las asignaciones en el JComboBox
    }

    private void cargarProyectos() {
        // Código para cargar los nombres de los proyectos en el JComboBox
    }
}

