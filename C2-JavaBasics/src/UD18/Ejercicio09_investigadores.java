package UD18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio09_investigadores {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/investigadores_db?useTimezone=true&serverTimezone=UTC", "root", "");
            System.out.println("Server Connected");

            insertarFacultades(conexion);
            insertarEquipos(conexion);
            insertarInvestigadores(conexion);
            insertarReservas(conexion);

            conexion.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("No se ha podido conectar con mi base de datos");
            ex.printStackTrace();
        }
    }

    private static void insertarFacultades(Connection conexion) throws SQLException {
        Statement stmt = conexion.createStatement();

        String insertFacultadesQuery = "INSERT INTO facultad (cod_facultad, nombre) VALUES " +
                "(11, 'Facultad de Alimentación'), " +
                "(12, 'Facultad de Deportes'), " +
                "(13, 'Facultad de Nutrición'), " +
                "(14, 'Facultad de Música'), " +
                "(15, 'Facultad de Videojuegos')";

        stmt.executeUpdate(insertFacultadesQuery);

        System.out.println("Registros insertados en la tabla facultad");

        stmt.close();
    }

    private static void insertarEquipos(Connection conexion) throws SQLException {
        Statement stmt = conexion.createStatement();

        String insertEquiposQuery = "INSERT INTO equipos (num_serie, nombre, cod_facultad) VALUES " +
                "('E011', 'Equipo Alpha', 11), " +
                "('E012', 'Equipo Tortuga', 12), " +
                "('E013', 'Equipo Escoba', 13), " +
                "('E014', 'Equipo Espacial', 14), " +
                "('E015', 'Equipo Fornite', 15)";

        stmt.executeUpdate(insertEquiposQuery);

        System.out.println("Registros insertados en la tabla equipos");

        stmt.close();
    }

    private static void insertarInvestigadores(Connection conexion) throws SQLException {
        Statement stmt = conexion.createStatement();

        String insertInvestigadoresQuery = "INSERT INTO investigadores (dni_investigador, nom_apels, cod_facultad) VALUES " +
                "('13345678', 'Pedro García', 11), " +
                "('87654321', 'Ana López', 12), " +
                "('11223344', 'Luis Martínez', 13), " +
                "('44332211', 'Laura Torres', 14), " +
                "('55667788', 'María Rodríguez', 15)";

        stmt.executeUpdate(insertInvestigadoresQuery);

        System.out.println("Registros insertados en la tabla investigadores");

        stmt.close();
    }

    private static void insertarReservas(Connection conexion) throws SQLException {
        Statement stmt = conexion.createStatement();

        String insertReservasQuery = "INSERT INTO reserva (comienzo, fin, dni_investigador, num_serie) VALUES " +
                "('2024-01-01', '2024-01-15', '12345678', 'E011'), " +
                "('2024-02-01', '2024-02-15', '87654321', 'E012'), " +
                "('2024-03-01', '2024-03-15', '11223344', 'E013'), " +
                "('2024-04-01', '2024-04-15', '44332211', 'E014'), " +
                "('2024-05-01', '2024-05-15', '55667788', 'E015')";

        stmt.executeUpdate(insertReservasQuery);

        System.out.println("Registros insertados en la tabla reserva");

        stmt.close();
    }
}

