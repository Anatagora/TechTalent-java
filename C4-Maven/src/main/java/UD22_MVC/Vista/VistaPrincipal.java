package UD22_MVC.Vista;


import UD22_MVC.Controlador.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class VistaPrincipal extends JFrame {
    private Controlador controlador;
    private JTable tablaClientes;
    private JButton agregarButton;
    private JButton editarButton;
    private JButton eliminarButton;
    private JButton actualizarButton;

    public VistaPrincipal(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
    }

    private void initComponents() {
        setTitle("Clientes");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        tablaClientes = new JTable();
        JScrollPane scrollPane = new JScrollPane(tablaClientes);

        JPanel buttonPanel = new JPanel();
        agregarButton = new JButton("Agregar");
        editarButton = new JButton("Editar");
        eliminarButton = new JButton("Eliminar");
        actualizarButton = new JButton("Actualizar");

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.mostrarVistaAgregar();
            }
        });

        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.mostrarVistaEditar();
            }
        });

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.mostrarVistaEliminar();
            }
        });

        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.actualizarVistaPrincipal();
            }
        });

        buttonPanel.add(agregarButton);
        buttonPanel.add(editarButton);
        buttonPanel.add(eliminarButton);
        buttonPanel.add(actualizarButton);

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);
    }

    public void actualizarTablaClientes(List<Cliente> clientes) {
        // Actualizar la tabla con los datos de los clientes
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("DNI");

        for (Cliente cliente : clientes) {
            model.addRow(new Object[]{cliente.getId(), cliente.getNombre(), cliente.getApellido(), cliente.getDni()});
        }

        tablaClientes.setModel(model);
    }

    public int getIdClienteSeleccionado() {
        // Obtener el ID del cliente seleccionado en la tabla
        int filaSeleccionada = tablaClientes.getSelectedRow();
        if (filaSeleccionada != -1) {
            return (int) tablaClientes.getValueAt(filaSeleccionada, 0);
        }
        return -1;
    }

    public void mostrarMensajeError(String mensaje) {
        // Mostrar un mensaje de error en un cuadro de diálogo
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}

