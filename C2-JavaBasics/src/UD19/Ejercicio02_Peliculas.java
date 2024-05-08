package UD19;

import javax.swing.*;
import java.awt.event.*;

public class Ejercicio02_Peliculas extends JFrame
{
	private JTextField textField;
	public Ejercicio02_Peliculas() {
        setTitle("Lista peliculas");
        setSize(420, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear un panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        // Crear etiqueta
        JLabel etiqueta= new JLabel("Introduce el titulo de una película");
		etiqueta.setBounds(200,20,200,20);
		panel.add(etiqueta);
		
        // Crear un campo de texto
        textField = new JTextField(20);
        textField.setBounds(10, 20, 180, 25);
        panel.add(textField);
        
        //Combobox 
        JComboBox comboBox = new JComboBox<>();
		comboBox.setBounds(10, 50, 180, 25);
		panel.add(comboBox);
		
		JLabel etiquetaCombo= new JLabel("Películas agregadas:");
		etiquetaCombo.setBounds(200, 50, 200, 20);
		panel.add(etiquetaCombo);
		
        // Crear un botón
        JButton boton_añadir = new JButton("Añadir película");
        boton_añadir.setBounds(125, 110, 150, 25);
        
        // Agregar ActionListener al botón
        boton_añadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener el texto del campo de texto
                String titulo_pelicula = textField.getText();
                // Mostrar un mensaje en un JOptionPane
                comboBox.addItem(titulo_pelicula);
            }
        });
        
        panel.add(boton_añadir);
        
        // Agregar el panel a la ventana
        add(panel);
    }
    
    public static void main(String[] args) {
        // Crear una instancia de la ventana
    	Ejercicio02_Peliculas ventana = new Ejercicio02_Peliculas();
        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
