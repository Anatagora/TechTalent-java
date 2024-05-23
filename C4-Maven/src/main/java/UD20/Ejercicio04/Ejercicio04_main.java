package UD20.Ejercicio04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio04_main extends JFrame implements MouseListener, ComponentListener {

    private JLabel etiqueta;
    private JTextArea areaTexto;
    private JButton botonFinalizar;

    public Ejercicio04_main() {
        super("Ventana de eventos");

        etiqueta = new JLabel("Eventos de ventana:");
        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        botonFinalizar = new JButton("Finalizar");

        JScrollPane scrollPane = new JScrollPane(areaTexto);

        getContentPane().setLayout(new GridBagLayout()); // Usar GridBagLayout para mejor control de posicionamiento

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        getContentPane().add(etiqueta, gbc);

        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        getContentPane().add(scrollPane, gbc);

        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.0;
        gbc.weighty = 0.0;
        getContentPane().add(botonFinalizar, gbc);

        // Mostrar mensaje inicial dentro del área de texto
        areaTexto.append("Ventana activada\n");

        // Establecer tamaño inicial
        setSize(300, 200); // Ajusta el tamaño según tus preferencias

        // Detectar eventos del mouse
        addMouseListener(this);

        // Detectar otros eventos de componente
        addComponentListener(this);

        // Acción del botón Finalizar
        botonFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("¡Cerrando la ventana!");
                dispose(); // Cerrar la ventana
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        areaTexto.append("Click del mouse en (" + e.getX() + ", " + e.getY() + ")\n");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        areaTexto.append("Botón del mouse presionado en (" + e.getX() + ", " + e.getY() + ")\n");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        areaTexto.append("Botón del mouse liberado en (" + e.getX() + ", " + e.getY() + ")\n");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        areaTexto.append("Mouse entró en la ventana\n");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        areaTexto.append("Mouse salió de la ventana\n");
    }

    @Override
    public void componentResized(ComponentEvent e) {
        areaTexto.append("Ventana redimensionada a: (" + getWidth() + ", " + getHeight() + ")\n");
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        areaTexto.append("Ventana movida a: (" + getX() + ", " + getY() + ")\n");
    }

    @Override
    public void componentShown(ComponentEvent e) {
        // Este evento no se utiliza en este ejemplo
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        // Este evento no se utiliza en este ejemplo
    }

    public static void main(String[] args) {
        new Ejercicio04_main();
    }
}




