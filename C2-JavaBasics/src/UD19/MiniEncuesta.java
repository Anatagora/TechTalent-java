package UD19;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.Hashtable;

public class MiniEncuesta extends JFrame {
    private JRadioButton windowsRadioButton, linuxRadioButton, macRadioButton;
    private JCheckBox programacionCheckBox, disenoGraficoCheckBox, administracionCheckBox;
    private JSlider horasDedicadasSlider;
    private JButton btnMostrar;

    public MiniEncuesta() {
        setTitle("Mini Encuesta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        // Panel para el sistema operativo
        JPanel sistemaOperativoPanel = new JPanel();
        sistemaOperativoPanel.setBorder(BorderFactory.createTitledBorder("Elije un sistema operativo"));
        windowsRadioButton = new JRadioButton("Windows");
        linuxRadioButton = new JRadioButton("Linux");
        macRadioButton = new JRadioButton("Mac");
        ButtonGroup sistemaOperativoGroup = new ButtonGroup();
        sistemaOperativoGroup.add(windowsRadioButton);
        sistemaOperativoGroup.add(linuxRadioButton);
        sistemaOperativoGroup.add(macRadioButton);
        sistemaOperativoPanel.add(windowsRadioButton);
        sistemaOperativoPanel.add(linuxRadioButton);
        sistemaOperativoPanel.add(macRadioButton);
        panel.add(sistemaOperativoPanel);

        // Panel para la especialidad
        JPanel especialidadPanel = new JPanel();
        especialidadPanel.setBorder(BorderFactory.createTitledBorder("Elige tu especialidad"));
        programacionCheckBox = new JCheckBox("Programación");
        disenoGraficoCheckBox = new JCheckBox("Diseño gráfico");
        administracionCheckBox = new JCheckBox("Administración");
        especialidadPanel.add(programacionCheckBox);
        especialidadPanel.add(disenoGraficoCheckBox);
        especialidadPanel.add(administracionCheckBox);
        panel.add(especialidadPanel);

        // Panel para las horas dedicadas
        JPanel horasDedicadasPanel = new JPanel();
        horasDedicadasPanel.setBorder(BorderFactory.createTitledBorder("Horas dedicadas en el ordenador"));
        horasDedicadasSlider = new JSlider(JSlider.HORIZONTAL, 1, 10, 1);
        horasDedicadasSlider.setMajorTickSpacing(1);
        horasDedicadasSlider.setPaintTicks(true);

        // Personalizar las etiquetas del slider
        Hashtable<Integer, JLabel> labelTable = new Hashtable<>();
        for (int i = 1; i <= 10; i++) {
            labelTable.put(i, new JLabel(String.valueOf(i)));
        }
        horasDedicadasSlider.setLabelTable(labelTable);
        horasDedicadasSlider.setPaintLabels(true);

        horasDedicadasPanel.add(horasDedicadasSlider);
        panel.add(horasDedicadasPanel);

        // Botón para mostrar los datos
        btnMostrar = new JButton("Mostrar Datos");
        // Establecer el tamaño personalizado del botón
        btnMostrar.setBounds(100,40,100,20);
        // Fin de la personalización del tamaño del botón
        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarDatos();
            }
        });
        panel.add(btnMostrar);

        add(panel);
    }

    // Método para mostrar los datos introducidos
    private void mostrarDatos() {
        String sistemaOperativo = "";
        if (windowsRadioButton.isSelected()) {
            sistemaOperativo = "Windows";
        } else if (linuxRadioButton.isSelected()) {
            sistemaOperativo = "Linux";
        } else if (macRadioButton.isSelected()) {
            sistemaOperativo = "Mac";
        }

        StringBuilder especialidades = new StringBuilder();
        if (programacionCheckBox.isSelected()) {
            especialidades.append("Programación, ");
        }
        if (disenoGraficoCheckBox.isSelected()) {
            especialidades.append("Diseño gráfico, ");
        }
        if (administracionCheckBox.isSelected()) {
            especialidades.append("Administración, ");
        }

        int horasDedicadas = horasDedicadasSlider.getValue();

        JOptionPane.showMessageDialog(this, "Sistema Operativo: " + sistemaOperativo + "\nEspecialidades: " +
                (especialidades.length() > 0 ? especialidades.substring(0, especialidades.length() - 2) : "Ninguna") +
                "\nHoras dedicadas: " + horasDedicadas, "Datos Introducidos", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MiniEncuesta encuesta = new MiniEncuesta();
            encuesta.setVisible(true);
        });
    }
}




