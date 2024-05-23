package UD20.Ejercicio03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio03_main {

    private JFrame ventana;
    private JLabel etiquetaContador1;
	private JLabel etiquetaContador2;
    private JButton botonIncrementar1, botonIncrementar2, botonReiniciar1, botonReiniciar2;
    private int valorContador1, valorContador2;

    public Ejercicio03_main() {
        inicializarComponentes();
        configurarVentana();
        agregarListeners();
    }

    private void inicializarComponentes() {
        valorContador1 = 0;
        valorContador2 = 0;

        etiquetaContador1 = new JLabel("Contador 1: 0", JLabel.CENTER);
        etiquetaContador2 = new JLabel("Contador 2: 0", JLabel.CENTER);

        botonIncrementar1 = new JButton("Incrementar");
        botonIncrementar2 = new JButton("Incrementar");
        botonReiniciar1 = new JButton("Reiniciar");
        botonReiniciar2 = new JButton("Reiniciar");
    }

    private void configurarVentana() {
        ventana = new JFrame("Contador de Clics");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.getContentPane().setLayout(new GridBagLayout()); // Se utiliza GridBagLayout para mayor flexibilidad

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.weightx = 0.5; // Distribución equitativa del ancho
        gbc.weighty = 0.5; // Distribución equitativa del alto

        gbc.gridx = 0;
        gbc.gridy = 0;
        ventana.getContentPane().add(etiquetaContador1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        ventana.getContentPane().add(etiquetaContador2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        ventana.getContentPane().add(botonIncrementar1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        ventana.getContentPane().add(botonIncrementar2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        ventana.getContentPane().add(botonReiniciar1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        ventana.getContentPane().add(botonReiniciar2, gbc);

        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    private void agregarListeners() {
        botonIncrementar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valorContador1++;
                actualizarEtiqueta(etiquetaContador1, valorContador1);
            }
        });

        botonIncrementar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valorContador2++;
                actualizarEtiqueta(etiquetaContador2, valorContador2);
            }
        });

        botonReiniciar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valorContador1 = 0;
                actualizarEtiqueta(etiquetaContador1, valorContador1);
            }
        });

        botonReiniciar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valorContador2 = 0;
                actualizarEtiqueta(etiquetaContador2, valorContador2);
            }
        });
    }

    private void actualizarEtiqueta(JLabel etiqueta, int valor) {
        etiqueta.setText("Contador " + (etiqueta == etiquetaContador1 ? 1 : 2) + ": " + valor);
    }

    public static void main(String[] args) {
        new Ejercicio03_main();
    }
}

