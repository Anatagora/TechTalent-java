package UD18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ejercicio03_almacenes 
{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/almacenes_db?useTimezone=true&serverTimezone=UTC", "root", "");
            System.out.println("Server Connected");

            // Insertar registros en la tabla almacenes
            insertarAlmacenes(conexion);

            // Insertar registros en la tabla cajas
            insertarCajas(conexion);

            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("No se ha podido conectar con la base de datos");
            ex.printStackTrace();
        }
    }

    // Método para insertar registros en la tabla almacenes
    private static void insertarAlmacenes(Connection conexion) throws SQLException {
        String insertAlmacenesQuery = "INSERT IGNORE INTO almacenes (lugar, capacidad) VALUES " +
                                      "('Alicante', 5100), " +
                                      "('Tarragona', 1150), " +
                                      "('Lleida', 1200), " +
                                      "('Valencia', 2120), " +
                                      "('Ibiza', 3180)";
        PreparedStatement statement = conexion.prepareStatement(insertAlmacenesQuery);
        statement.executeUpdate();
        System.out.println("Registros insertados en la tabla almacenes");
        statement.close();
    }

    // Método para insertar registros en la tabla cajas
    private static void insertarCajas(Connection conexion) throws SQLException {
        String insertCajasQuery = "INSERT IGNORE INTO cajas (num_referencia, contenido, valor, cod_almacen) VALUES " +
                                  "('C011', 'Televisión', 50, 21), " +
                                  "('C012', 'xBox', 60, 22), " +
                                  "('C013', 'Arenero gato', 70, 23), " +
                                  "('C014', 'Juegos de mesa', 80, 24), " +
                                  "('C015', 'Arena gato', 90, 25)";
        PreparedStatement statement = conexion.prepareStatement(insertCajasQuery);
        statement.executeUpdate();
        System.out.println("Registros insertados en la tabla cajas");
        statement.close();
    }
}

