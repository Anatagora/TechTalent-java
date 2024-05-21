package UD18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class ejemplo_conexion_mysql {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC", "root", "");
            System.out.println("Server Connected");

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("No se ha podido conectar con mi base de datos");
            ex.printStackTrace();
        } 
//        finally 
//        {
//            try {
//                if (conexion != null) {
//                    conexion.close();
//                }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
    }
}
