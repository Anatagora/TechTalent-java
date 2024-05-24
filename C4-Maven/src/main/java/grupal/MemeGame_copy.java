package grupal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;

public class MemeGame_copy {
    private static final int ROWS = 4;
    private static final int COLS = 4;
    private static final int NUM_CARDS = ROWS * COLS;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_images";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String SQL_QUERY = "SELECT name, image FROM parejas ORDER BY RAND() LIMIT ?";
    private static final String WIN_GIF_URL = "https://tenor.com/es/view/mapache-pedro-gif-7206648027763736533";
    private static ImageIcon backImage;
    private static ArrayList<ImageIcon> cardImages;
    private static JButton[] cardButtons;
    private static int firstCardIndex = -1;
    private static int secondCardIndex = -1;
    private static int moveCount = 0;
    private static int pairsFound = 0;
    private static JLabel moveCounterLabel;

    public static void main(String[] args) {
        loadCardImagesFromDatabase();

        JFrame frame = new JFrame("Juego de Memoria");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(ROWS, COLS));

        cardButtons = new JButton[NUM_CARDS];
        Dimension buttonSize = new Dimension(frame.getWidth() / COLS, frame.getHeight() / ROWS);

        for (int i = 0; i < NUM_CARDS; i++) {
            cardButtons[i] = new JButton();
            cardButtons[i].setIcon(scaleImageIcon(backImage, buttonSize));
            cardButtons[i].setPreferredSize(buttonSize);
            cardButtons[i].setBorderPainted(false);
            cardButtons[i].setContentAreaFilled(false);
            cardButtons[i].addActionListener(new CardClickListener(i));
            panel.add(cardButtons[i]);
        }

        moveCounterLabel = new JLabel("Movimientos: 0");
        JPanel topPanel = new JPanel();
        topPanel.add(moveCounterLabel);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu gameMenu = new JMenu("Juego");
        JMenuItem restartItem = new JMenuItem("Reiniciar");
        restartItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restartGame();
            }
        });
        gameMenu.add(restartItem);

        JMenuItem exitItem = new JMenuItem("Finalizar");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        gameMenu.add(exitItem);
        menuBar.add(gameMenu);

        JMenu infoMenu = new JMenu("Información");
        JMenuItem aboutItem = new JMenuItem("Memory Game Espacial, creado por Jose, Alex y Aurora, los mejores!");
        infoMenu.add(aboutItem);
        menuBar.add(infoMenu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }

    private static void loadCardImagesFromDatabase() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(SQL_QUERY)) {
            pstmt.setInt(1, NUM_CARDS / 2);
            ResultSet rs = pstmt.executeQuery();

            cardImages = new ArrayList<>();
            while (rs.next()) {
                byte[] imageData = rs.getBytes("image");
                String name = rs.getString("name");
                ImageIcon icon = new ImageIcon(imageData);
                icon.setDescription(name);
                cardImages.add(icon);

                ImageIcon iconCopy = new ImageIcon(imageData);
                iconCopy.setDescription(name);
                cardImages.add(iconCopy);
            }

            if (cardImages.size() < NUM_CARDS) {
                throw new RuntimeException("No hay suficientes imágenes en la base de datos para crear pares de cartas.");
            }

            Collections.shuffle(cardImages);

            loadBackImageFromDatabase();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void loadBackImageFromDatabase() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement("SELECT image FROM dorso WHERE name = 'newDorso'");
             ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                byte[] imageData = rs.getBytes("image");
                backImage = new ImageIcon(imageData);
            } else {
                throw new RuntimeException("No se encontró la imagen del dorso en la base de datos.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ImageIcon scaleImageIcon(ImageIcon icon, Dimension size) {
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(size.width, size.height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

    private static ImageIcon loadImageIconFromURL(String url) {
        try {
            return new ImageIcon(url);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static class CardClickListener implements ActionListener {
        private int index;

        public CardClickListener(int index) {
            this.index = index;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (firstCardIndex == -1) {
                firstCardIndex = index;
                cardButtons[index].setIcon(scaleImageIcon(cardImages.get(index), cardButtons[index].getSize()));
            } else if (secondCardIndex == -1 && index != firstCardIndex) {
                secondCardIndex = index;
                cardButtons[index].setIcon(scaleImageIcon(cardImages.get(index), cardButtons[index].getSize()));

                moveCount++;
                moveCounterLabel.setText("Movimientos: " + moveCount);

                if (cardImages.get(firstCardIndex).getDescription().equals(cardImages.get(secondCardIndex).getDescription())) {
                    pairsFound++;
                    firstCardIndex = -1;
                    secondCardIndex = -1;
                    checkGameWon();
                } else {
                    Timer timer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            cardButtons[firstCardIndex].setIcon(scaleImageIcon(backImage, cardButtons[firstCardIndex].getSize()));
                            cardButtons[secondCardIndex].setIcon(scaleImageIcon(backImage, cardButtons[secondCardIndex].getSize()));
                            firstCardIndex = -1;
                            secondCardIndex = -1;
                        }
                    });
                    timer.setRepeats(false);
                    timer.start();
                }
            }
        }

        private static void checkGameWon() {
            if (pairsFound == NUM_CARDS / 2) {
                // Crear un panel personalizado que contenga el GIF
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout()); // Establecer un BorderLayout para el panel

               

                // Cargar el GIF desde una URL
                ImageIcon winGif = loadImageIconFromURL(WIN_GIF_URL);
                JLabel gifLabel = new JLabel(winGif);

                JLabel winLabel = new JLabel(winGif, SwingConstants.CENTER); // Centrar el texto
                
                panel.add(winLabel, BorderLayout.NORTH); // Añadir el texto en la parte superior
                panel.add(gifLabel, BorderLayout.CENTER); // Añadir el GIF en el centro

                // Mostrar el panel dentro de un JOptionPane
                JOptionPane.showMessageDialog(null, panel,"¡¡FELICIDADES, HAS GANADO!!", JOptionPane.PLAIN_MESSAGE);
            }
        }

    }

    private static void restartGame() {
        firstCardIndex = -1;
        secondCardIndex = -1;
        moveCount = 0;
        pairsFound = 0;
        moveCounterLabel.setText("Movimientos: 0");

        Collections.shuffle(cardImages);

        Dimension buttonSize = new Dimension(cardButtons[0].getWidth(), cardButtons[0].getHeight());
        for (int i = 0; i < NUM_CARDS; i++) {
            cardButtons[i].setIcon(scaleImageIcon(backImage, buttonSize));
        }
    }
}
