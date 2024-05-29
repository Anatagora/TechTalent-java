package UD22_MVC.Vista;

import javax.swing.*;
import UD22_MVC.controlador.VideoController;
import UD22_MVC.modelo.Video;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VideoCreateView extends JFrame {
    private VideoController VideoController;

    public VideoCreateView() {
        VideoController = new VideoController();
        setTitle("Agregar Video");
        setSize(400, 300);
        setLayout(new GridLayout(0, 2));

        JTextField titleField = new JTextField();
        JTextField directorField = new JTextField();
        JTextField cliIdField = new JTextField();

        add(new JLabel("Título:"));
        add(titleField);
        add(new JLabel("Director:"));
        add(directorField);
        add(new JLabel("ID Cliente:"));
        add(cliIdField);

        JButton addButton = new JButton("Agregar");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Video video = new Video();
                video.setTitle(titleField.getText());
                video.setDirector(directorField.getText());
                video.setCli_id(Integer.parseInt(cliIdField.getText()));
                VideoController.addVideo(video);
                JOptionPane.showMessageDialog(null, "Video agregado exitosamente.");
            }
        });
        add(addButton);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VideoCreateView();
    }
}

