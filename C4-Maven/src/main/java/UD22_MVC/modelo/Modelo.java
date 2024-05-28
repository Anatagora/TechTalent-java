package UD22_MVC.modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private Connection conexion;

    public Modelo() {
        // Inicializar la conexión a la base de datos
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.jdbc.Driver");
            // Establecer la conexión
            String url = "jdbc:mysql://localhost:3306/nombre_base_datos";
            String usuario = "root";
            String contraseña = "";
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void agregarCliente(String nombre, String apellido, int dni) {
        try {
            // Preparar la sentencia SQL para insertar un nuevo cliente
            PreparedStatement statement = conexion.prepareStatement("INSERT INTO cliente (nombre, apellido, dni) VALUES (?, ?, ?)");
            statement.setString(1, nombre);
            statement.setString(2, apellido);
            statement.setInt(3, dni);
            // Ejecutar la sentencia
            statement.executeUpdate();
            // Cerrar el statement
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarCliente(int idCliente) {
        try {
            // Preparar la sentencia SQL para eliminar un cliente por su ID
            PreparedStatement statement = conexion.prepareStatement("DELETE FROM cliente WHERE id = ?");
            statement.setInt(1, idCliente);
            // Ejecutar la sentencia
            statement.executeUpdate();
            // Cerrar el statement
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> obtenerTodosLosClientes() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            // Preparar la sentencia SQL para obtener todos los clientes
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM cliente");
            // Recorrer los resultados y crear objetos Cliente
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                int dni = resultSet.getInt("dni");
                // Crear un nuevo objeto Cliente y agregarlo a la lista
                Cliente cliente = new Cliente(id, nombre, apellido, dni);
                clientes.add(cliente);
            }
            // Cerrar el ResultSet y el Statement
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    public Cliente obtenerCliente(int idCliente) {
        Cliente cliente = null;
        try {
            // Preparar la sentencia SQL para obtener un cliente por su ID
            PreparedStatement statement = conexion.prepareStatement("SELECT * FROM cliente WHERE id = ?");
            statement.setInt(1, idCliente);
            ResultSet resultSet = statement.executeQuery();
            // Verificar si se encontró un cliente con el ID proporcionado
            if (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                int dni = resultSet.getInt("dni");
                // Crear un objeto Cliente con los datos obtenidos
                cliente = new Cliente(idCliente, nombre, apellido, dni);
            }
            // Cerrar el ResultSet y el Statement
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cliente;
    }

    public void actualizarCliente(int idCliente, String nombre, String apellido, int dni) {
        try {
            // Preparar la sentencia SQL para actualizar un cliente por su ID
            PreparedStatement statement = conexion.prepareStatement("UPDATE cliente SET nombre = ?, apellido = ?, dni = ? WHERE id = ?");
            statement.setString(1, nombre);
            statement.setString(2, apellido);
            statement.setInt(3, dni);
            statement.setInt(4, idCliente);
            // Ejecutar la sentencia
            statement.executeUpdate();
            // Cerrar el statement
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cerrarConexion() {
        try {
            // Cerrar la conexión a la base de datos
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
