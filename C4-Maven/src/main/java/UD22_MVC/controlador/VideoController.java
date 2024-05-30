package UD22_MVC.controlador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import UD22_MVC.modelo.Video;

public class VideoController {
    private conexion_database conexionDatabase;

    public VideoController() {
        conexionDatabase = new conexion_database();
    }

    // Método para obtener todos los IDs de los videos
    public List<Integer> getAllVideoIds() {
        List<Integer> ids = new ArrayList<>();
        try {
            Connection conn = conexion_database.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id FROM videos");

            while (rs.next()) {
                ids.add(rs.getInt("id"));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ids;
    }

    // Método para obtener un video por su ID
    public Video getVideoById(int id) {
        Video video = null;
        try {
            Connection conn = conexion_database.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM videos WHERE id = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                video = new Video();
                video.setId(rs.getInt("id"));
                video.setTitle(rs.getString("title"));
                video.setDirector(rs.getString("director"));
                video.setCli_id(rs.getInt("cli_id"));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return video;
    }

    // Método para obtener todos los videos
    public List<Video> getAllVideos() {
        List<Video> videos = new ArrayList<>();
        try {
            Connection conn = conexion_database.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM videos");

            while (rs.next()) {
                Video video = new Video();
                video.setId(rs.getInt("id"));
                video.setTitle(rs.getString("title"));
                video.setDirector(rs.getString("director"));
                video.setCli_id(rs.getInt("cli_id"));
                videos.add(video);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return videos;
    }

    // Método para agregar un video
    public void addVideo(Video video) {
        try {
            Connection conn = conexion_database.getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO videos (title, director, cli_id) VALUES (?, ?, ?)");
            stmt.setString(1, video.getTitle());
            stmt.setString(2, video.getDirector());
            stmt.setInt(3, video.getCli_id());
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un video por su ID
    public void deleteVideo(int id) {
        try {
            Connection conn = conexion_database.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM videos WHERE id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para actualizar un video
    public void updateVideo(Video video) {
        try {
            Connection conn = conexion_database.getConnection();
            PreparedStatement stmt = conn.prepareStatement("UPDATE videos SET title = ?, director = ?, cli_id = ? WHERE id = ?");
            stmt.setString(1, video.getTitle());
            stmt.setString(2, video.getDirector());
            stmt.setInt(3, video.getCli_id());
            stmt.setInt(4, video.getId());
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
