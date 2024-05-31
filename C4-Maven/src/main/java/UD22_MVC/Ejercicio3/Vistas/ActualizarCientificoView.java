package UD22_MVC.Ejercicio3.Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;
import UD22_MVC.Ejercicio3.Controller.CientificoController;
import UD22_MVC.Ejercicio3.Modelo.Cientifico;

public class ActualizarCientificoView extends JFrame {
    private JComboBox<Cientifico> cientificoComboBox;
    private JTextField nombreField;
    private JButton submitButton;

    public ActualizarCientificoView() {
        setTitle("Actualizar Científico");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Seleccionar Científico:"));
        cientificoComboBox = new JComboBox<>();
        cargarCientificos(); // Llena el JComboBox con los científicos disponibles
        panel.add(cientificoComboBox);

        panel.add(new JLabel("Nuevo Nombre y Apellidos:"));
        nombreField = new JTextField(20);
        panel.add(nombreField);

        submitButton = new JButton("Actualizar");
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cientifico cientifico = (Cientifico) cientificoComboBox.getSelectedItem(); // Obtiene el científico seleccionado
                String nuevoNombre = nombreField.getText();
                CientificoController controller = new CientificoController();
                controller.updateCientifico(cientifico.getDNI(), nuevoNombre);
                JOptionPane.showMessageDialog(null, "Científico actualizado exitosamente!");
                dispose(); // Cierra esta ventana después de la acción
            }
        });

        add(panel);
    }

    // Método para cargar los científicos disponibles en el JComboBox
    private void cargarCientificos() {
        CientificoController controller = new CientificoController();
        List<Cientifico> cientificos = controller.getAllCientificos();
        for (Cientifico cientifico : cientificos) {
            cientificoComboBox.addItem(cientifico);
        }
    }
}
