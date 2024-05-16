package UD18_JDBC_conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio06_Piezas_y_proveedores 
{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/piezas_proveedores?useTimezone=true&serverTimezone=UTC",
                    "root", "");
            System.out.println("Server Connected");

            // Insertar registros en la tabla piezas
            insertarPiezas(conexion);

            // Insertar registros en la tabla proveedores
            insertarProveedores(conexion);

            // Insertar registros en la tabla suministra
            insertarSuministra(conexion);

            conexion.close(); // Cerrar la conexión después de usarla
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("No se ha podido conectar con mi base de datos");
            ex.printStackTrace();
        }
    }

    private static void insertarPiezas(Connection conexion) throws SQLException {
        Statement stmt = conexion.createStatement();

        // Consulta de inserción para varios registros en la tabla piezas
        String insertPiezasQuery = "INSERT INTO piezas (nombre) VALUES " +
                "('taladro'), " +
                "('cuchilla'), " +
                "('bisturi'), " +
                "('botella'), " +
                "('trompeta')";

        stmt.executeUpdate(insertPiezasQuery);

        System.out.println("Registros insertados en la tabla piezas");

        stmt.close();
    }

    private static void insertarProveedores(Connection conexion) throws SQLException {
        Statement stmt = conexion.createStatement();

        // Consulta de inserción para varios registros en la tabla proveedores
        String insertProveedoresQuery = "INSERT INTO proveedores (id_proveedor, nombre) VALUES " +
                "('1122', 'Bosch'), " +
                "('1123', 'Samsung Electronics'), " +
                "('1124', 'LG Electronics'), " +
                "('1125', 'Sony Corporation'), " +
                "('1126', 'Lenovo Group Ltd.')";

        stmt.executeUpdate(insertProveedoresQuery);

        System.out.println("Registros insertados en la tabla proveedores");

        stmt.close();
    }

    private static void insertarSuministra(Connection conexion) throws SQLException {
        Statement stmt = conexion.createStatement();

        // Consulta de inserción para varios registros en la tabla suministra
        String insertSuministraQuery = "INSERT INTO suministra (precio) VALUES " +
                "(100), " +
                "(150), " +
                "(200), " +
                "(250), " +
                "(300)";

        stmt.executeUpdate(insertSuministraQuery);

        System.out.println("Registros insertados en la tabla suministra");

        stmt.close();
    }
}

