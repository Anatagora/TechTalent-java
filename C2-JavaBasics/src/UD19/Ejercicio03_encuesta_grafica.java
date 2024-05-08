package UD19;

import javax.swing.*;
import java.awt.event.*;

public class Ejercicio03_encuesta_grafica extends JFrame {
	private JTextField textField;

	public Ejercicio03_encuesta_grafica() {
		setTitle("Lista peliculas");
		setSize(420, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Crear un panel
		JPanel panel = new JPanel();
		panel.setLayout(null);

		// Crear etiqueta
		JLabel etiqueta = new JLabel("Elige un sistema operativo");
		etiqueta.setBounds(200, 20, 200, 20);
		panel.add(etiqueta);

		// Componente "Botón radio" se debe "agrupar" selección ÚNICA
		JRadioButton rdbtnOpcion1 = new JRadioButton("Windows", false);
		rdbtnOpcion1.setBounds(43, 194, 109, 23);
		panel.add(rdbtnOpcion1);

		JRadioButton rdbtnOpcion2 = new JRadioButton("Linux", false);
		rdbtnOpcion2.setBounds(43, 220, 109, 23);
		panel.add(rdbtnOpcion2);

		JRadioButton rdbtnOpcion3 = new JRadioButton("Mac", false);
		rdbtnOpcion3.setBounds(43, 246, 109, 23);
		panel.add(rdbtnOpcion3);

		// Crear etiqueta
		JLabel etiqueta2 = new JLabel("Elige una especialidad");
		etiqueta.setBounds(200, 20, 200, 20);
		panel.add(etiqueta2);

		// Componente "Cajas seleccionables"
		JCheckBox chckbxOpcion = new JCheckBox("Programación", false);
		chckbxOpcion.setBounds(43, 305, 97, 23);
		panel.add(chckbxOpcion);

		JCheckBox chckbxNewCheck = new JCheckBox("Diseño gráfico", false);
		chckbxNewCheck.setBounds(43, 325, 97, 23);
		panel.add(chckbxNewCheck);

		JCheckBox chckbxOpcion3 = new JCheckBox("Administración", false);
		chckbxOpcion3.setBounds(43, 345, 97, 23);
		panel.add(chckbxOpcion3);

		// Crear un botón
		JButton boton_fin = new JButton("Finalizar");
		boton_fin.setBounds(125, 110, 150, 25);

		// Agregar ActionListener al botón
		boton_fin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Obtener el texto del campo de texto
				String titulo_pelicula = textField.getText();

				// Mostrar un mensaje en un JOptionPane
			JOptionPane.showMessageDialog(sistema_operativo, especialidad, horas_dedicadas);

			}
		});

		panel.add(boton_fin);

		// Agregar el panel a la ventana
		add(panel);
	}

	public static void main(String[] args) {
		// Crear una instancia de la ventana
		Ejercicio03_encuesta_grafica ventana = new Ejercicio03_encuesta_grafica();
		// Hacer visible la ventana
		ventana.setVisible(true);
	}
}
