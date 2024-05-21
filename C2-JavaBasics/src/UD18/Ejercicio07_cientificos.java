package UD18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio07_cientificos {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cientificos_db?useTimezone=true&serverTimezone=UTC", "root", "");
            System.out.println("Conexión establecida con la base de datos");

            insertarCientificos(conexion);
            insertarProyecto(conexion);
            insertarAsignadoA(conexion);

            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("No se ha podido conectar con la base de datos");
            ex.printStackTrace();
        }
    }

    private static void insertarCientificos(Connection conexion) throws SQLException {
        Statement stmt = conexion.createStatement();

        String insertCientificosQuery = "INSERT INTO cientificos (dni_cientifico, nom_apels) VALUES " +
                "('13335678', 'John Doe'), " +
                "('22256789', 'Jane Smith'), " +
                "('44567890', 'Alice Johnson'), " +
                "('55678901', 'Bob Brown'), " +
                "('66789012', 'Eva Martinez')";

        stmt.executeUpdate(insertCientificosQuery);

        System.out.println("Registros insertados en la tabla cientificos");

        stmt.close();
    }

    private static void insertarProyecto(Connection conexion) throws SQLException {
        Statement stmt = conexion.createStatement();

        String insertProyectoQuery = "INSERT INTO proyecto (id_proyecto, nombre, horas) VALUES " +
                "('P014', 'Proyecto Alma', 100), " +
                "('P015', 'Proyecto Bocachancla', 150), " +
                "('P016', 'Proyecto Carretera', 200), " +
                "('P017', 'Proyecto Dedal', 120), " +
                "('P018', 'Proyecto Estereo', 180)";

        stmt.executeUpdate(insertProyectoQuery);

        System.out.println("Registros insertados en la tabla proyecto");

        stmt.close();
    }

    private static void insertarAsignadoA(Connection conexion) throws SQLException {
        Statement stmt = conexion.createStatement();

        String insertAsignadoAQuery = "INSERT INTO asignado_a (dni_cientifico, id_proyecto) VALUES " +
                "('13335678', 'P014'), " +
                "('22256789', 'P015'), " +
                "('44567890', 'P016'), " +
                "('55678901', 'P017'), " +
                "('66789012', 'P018')";

        stmt.executeUpdate(insertAsignadoAQuery);

        System.out.println("Registros insertados en la tabla asignado_a");

        stmt.close();
    }
}
