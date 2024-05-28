package UD22_MVC.Controlador;


import UD22_MVC.modelo.*;
import UD22_MVC.Vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerListener;
import java.awt.event.FocusListener;

import UD22_MVC.Vista.VistaAgregar;
import UD22_MVC.Vista.VistaEditar;
import UD22_MVC.Vista.VistaEliminar;
import UD22_MVC.Vista.VistaPrincipal;

public class Controlador {
    private UD22_MVC.modelo.Modelo modelo;
    private VistaPrincipal vistaPrincipal;
    private VistaAgregar vistaAgregar;
    private VistaEditar vistaEditar;
    private VistaEliminar vistaEliminar;

    public Controlador(Modelo modelo, VistaPrincipal vistaPrincipal, VistaAgregar vistaAgregar, VistaEditar vistaEditar, VistaEliminar vistaEliminar) {
        this.modelo = modelo;
        this.vistaPrincipal = vistaPrincipal;
        this.vistaAgregar = vistaAgregar;
        this.vistaEditar = vistaEditar;
        this.vistaEliminar = vistaEliminar;

        // Configurar eventos de la vista principal
        this.vistaPrincipal.addAgregarListener(new AgregarListener());
        this.vistaPrincipal.addEditarListener(new EditarListener());
        this.vistaPrincipal.addFocusListener(new EliminarListener());
        this.vistaPrincipal.addActualizarListener(new ActualizarListener());

        // Configurar eventos de la vista de agregar
        this.vistaAgregar.addContainerListener(new GuardarListener());
        this.vistaAgregar.addContainerListener(new CancelarListener());

        // Configurar eventos de la vista de editar
        this.vistaEditar.addContainerListener((ContainerListener) new GuardarListener());
        this.vistaEditar.addContainerListener((ContainerListener) new CancelarListener());

        // Configurar eventos de la vista de eliminar
        this.vistaEliminar.addFocusListener((FocusListener) new EliminarListener());
        this.vistaEliminar.addContainerListener((ContainerListener) new CancelarListener());
    }

    // Clase interna para manejar eventos de agregar
    class AgregarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Mostrar la vista de agregar
            vistaAgregar.setVisible(true);
        }
    }

    // Clase interna para manejar eventos de editar
    class EditarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Obtener el ID del cliente seleccionado en la vista principal
            int idCliente = vistaPrincipal.getIdClienteSeleccionado();
            if (idCliente != -1) {
                // Obtener los datos del cliente con el ID proporcionado del modelo
                // Mostrar la vista de editar con los datos del cliente
                vistaEditar.mostrarDatosCliente(modelo.obtenerCliente(idCliente));
                vistaEditar.setVisible(true);
            } else {
                // Mostrar un mensaje de error si no se seleccionó ningún cliente
                vistaPrincipal.mostrarMensajeError("Por favor seleccione un cliente para editar.");
            }
        }
    }

    // Clase interna para manejar eventos de eliminar
    class EliminarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Obtener el ID del cliente seleccionado en la vista principal
            int idCliente = vistaPrincipal.getIdClienteSeleccionado();
            if (idCliente != -1) {
                // Mostrar la vista de confirmación de eliminación
                vistaEliminar.mostrarConfirmacionEliminar(idCliente);
                vistaEliminar.setVisible(true);
            } else {
                // Mostrar un mensaje de error si no se seleccionó ningún cliente
                vistaPrincipal.mostrarMensajeError("Por favor seleccione un cliente para eliminar.");
            }
        }
    }

    // Clase interna para manejar eventos de actualizar la vista principal
    class ActualizarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Actualizar la vista principal con los datos más recientes del modelo
            vistaPrincipal.actualizarTablaClientes(modelo.obtenerTodosLosClientes());
        }
    }

    // Clase interna para manejar eventos de guardar en las vistas de agregar y editar
    class GuardarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Obtener los datos ingresados por el usuario desde la vista
            String nombre = vistaAgregar.getNombre();
            String apellido = vistaAgregar.getApellido();
            int dni = vistaAgregar.getDni();
            // Validar los datos ingresados (puedes implementar validaciones aquí)
            // Guardar los datos en el modelo
            modelo.agregarCliente(nombre, apellido, dni);
            // Cerrar la vista de agregar
            vistaAgregar.setVisible(false);
            // Actualizar la vista principal con los datos más recientes
            vistaPrincipal.actualizarTablaClientes(modelo.obtenerTodosLosClientes());
        }
    }

    // Clase interna para manejar eventos de cancelar en las vistas de agregar y editar
    class CancelarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Cerrar la vista de agregar o editar
            if (vistaAgregar.isVisible()) {
                vistaAgregar.setVisible(false);
            }
            if (vistaEditar.isVisible()) {
                vistaEditar.setVisible(false);
            }
        }
    }
}

