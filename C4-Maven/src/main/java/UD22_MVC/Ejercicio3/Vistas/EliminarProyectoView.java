package UD22_MVC.Ejercicio3.Vistas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import UD22_MVC.Ejercicio3.Controller.ProyectoController;

public class EliminarProyectoView extends JFrame {
    private JTextField idProyectoField;
    private JButton eliminarButton;

    public EliminarProyectoView() {
        setTitle("Eliminar Proyecto");
        setLayout(null);

        JLabel idProyectoLabel = new JLabel("ID Proyecto:");
        idProyectoLabel.setBounds(30, 30, 100, 30);
        add(idProyectoLabel);

        idProyectoField = new JTextField();
        idProyectoField.setBounds(150, 30, 150, 30);
        add(idProyectoField);

        eliminarButton = new JButton("Eliminar");
        eliminarButton.setBounds(150, 70, 100, 30);
        add(eliminarButton);

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idProyecto = idProyectoField.getText();
                ProyectoController.deleteProyecto(idProyecto);
                JOptionPane.showMessageDialog(null, "Proyecto eliminado con éxito!");
            }
        });

        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
