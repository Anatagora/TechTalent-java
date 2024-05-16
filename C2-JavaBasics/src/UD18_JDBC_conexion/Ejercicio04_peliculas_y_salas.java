package UD18_JDBC_conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ejercicio04_peliculas_y_salas {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/peliculas_y_salas?useTimezone=true&serverTimezone=UTC", "root", "");
            System.out.println("Server Connected");

            insertarPeliculas(conexion);
            insertarSalas(conexion);

            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("No se ha podido conectar con mi base de datos");
            ex.printStackTrace();
        }
    }

    private static void insertarPeliculas(Connection conexion) throws SQLException {
        String insertPeliculasQuery = "INSERT INTO peliculas (cod_pelicula, nombre, calificacion_edad) VALUES " +
                "(211, 'Tin tin', 18), " +
                "(212, 'Aquaman', 12), " +
                "(213, 'Dune 3', 15), " +
                "(214, 'El viaje de chihiro', 12), " +
                "(215, 'Transformer', 18)";
        PreparedStatement statement = conexion.prepareStatement(insertPeliculasQuery);
        statement.executeUpdate();
        System.out.println("Registros insertados en la tabla peliculas");
        statement.close();
    }

    private static void insertarSalas(Connection conexion) throws SQLException {
        String insertSalasQuery = "INSERT INTO salas (nombre, cod_pelicula) VALUES " +
                "('Sala 11', 211), " +
                "('Sala 12', 212), " +
                "('Sala 13', 213), " +
                "('Sala 14', 214), " +
                "('Sala 15', 215)";
        PreparedStatement statement = conexion.prepareStatement(insertSalasQuery);
        statement.executeUpdate();
        System.out.println("Registros insertados en la tabla salas");
        statement.close();
    }
}

