package UD22_MVC.Vista;

import UD22_MVC.Controlador.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaEditar extends JFrame {
    private Controlador controlador;
    private JTextField nombreTextField;
    private JTextField apellidoTextField;
    private JTextField dniTextField;
    private JButton guardarButton;
    private JButton cancelarButton;
    private int idCliente;

    public VistaEditar(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
    }

    private void initComponents() {
        setTitle("Editar Cliente");
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
                controlador.guardarCliente(idCliente);
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

    public void mostrarDatosCliente(Cliente cliente) {
        // Mostrar los datos del cliente en los campos de texto
        idCliente = cliente.getId();
        nombreTextField.setText(cliente.getNombre());
        apellidoTextField.setText(cliente.getApellido());
        dniTextField.setText(String.valueOf(cliente.getDni()));
    }
}

