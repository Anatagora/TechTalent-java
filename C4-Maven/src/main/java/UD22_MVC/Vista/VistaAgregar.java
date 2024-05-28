package UD22_MVC.Vista;


import UD22_MVC.Controlador.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaAgregar extends JFrame {
    private Controlador controlador;
    private JTextField nombreTextField;
    private JTextField apellidoTextField;
    private JTextField dniTextField;
    private JButton guardarButton;
    private JButton cancelarButton;

    public VistaAgregar(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
    }

    private void initComponents() {
        setTitle("Agregar Cliente");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreTextField = new JTextField();
        JLabel apellidoLabel = new JLabel("Apellido:");
        apellidoTextField = new JTextField();
        JLabel dniLabel = new JLabel("DNI:");
        dniTextField = new JTextField();

        panel.add(nombreLabel);
        panel.add(nombreTextField);
        panel.add(apellidoLabel);
        panel.add(apellidoTextField);
        panel.add(dniLabel);
        panel.add(dniTextField);

        guardarButton = new JButton("Guardar");
        cancelarButton = new JButton("Cancelar");

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.guardarCliente();
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        panel.add(guardarButton);
        panel.add(cancelarButton);

        add(panel);
    }

    public String getNombre() {
        return nombreTextField.getText().trim();
    }

    public String getApellido() {
        return apellidoTextField.getText().trim();
    }

    public int getDni() {
        String dniStr = dniTextField.getText().trim();
        return dniStr.isEmpty() ? 0 : Integer.parseInt(dniStr);
    }
}

