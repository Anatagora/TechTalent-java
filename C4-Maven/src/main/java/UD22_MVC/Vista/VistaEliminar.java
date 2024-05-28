package UD22_MVC.Vista;


import UD22_MVC.Controlador.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaEliminar extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Controlador controlador;
    private JButton eliminarButton;
    private JButton cancelarButton;
    private int idCliente;

    public VistaEliminar(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
    }

    private void initComponents() {
        setTitle("Eliminar Cliente");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        eliminarButton = new JButton("Eliminar");
        cancelarButton = new JButton("Cancelar");

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.eliminarCliente(idCliente);
                setVisible(false);
            }
        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        panel.add(eliminarButton);
        panel.add(cancelarButton);

        add(panel);
    }

    public void mostrarConfirmacionEliminar(int idCliente) {
        // Mostrar ventana de confirmación de eliminación
        this.idCliente = idCliente;
        setVisible(true);
    }
}

