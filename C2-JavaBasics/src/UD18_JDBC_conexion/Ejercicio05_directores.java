package UD18_JDBC_conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio05_directores {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/directores_db?useTimezone=true&serverTimezone=UTC", "root", "");
            System.out.println("Server Connected");

            insertarDespachos(conexion);
            insertarDirectores(conexion);

            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("No se ha podido conectar con la base de datos");
            ex.printStackTrace();
        }
    }

    private static void insertarDespachos(Connection conexion) throws SQLException {
        Statement stmt = conexion.createStatement();

        // Consulta de inserción para varios registros en la tabla despachos
        String insertDespachosQuery = "INSERT INTO despachos (capacidad) VALUES " +
                "(10), " +
                "(11), " +
                "(13), " +
                "(14), " +
                "(15)";

        stmt.executeUpdate(insertDespachosQuery);

        System.out.println("Registros insertados en la tabla despachos");

        stmt.close();
    }

    private static void insertarDirectores(Connection conexion) throws SQLException {
        Statement stmt = conexion.createStatement();

        // Consulta de inserción para varios registros en la tabla directores
        String insertDirectoresQuery = "INSERT INTO directores (dni, nom_apels, dni_jefe, num_despacho) VALUES " +
                "('23466', 'Defer, Gervasio', NULL, 1), " +
                "('33456', 'Fuertes, Dolores', NULL, 2), " +
                "('43456', 'Tilla, Aitor', NULL, 3), " +
                "('53456', 'Porada, Eva', NULL, 5), " +
                "('73456', 'Colero, Esther', NULL, 9)";

        stmt.executeUpdate(insertDirectoresQuery);

        System.out.println("Registros insertados en la tabla directores");

        stmt.close();
    }
}



