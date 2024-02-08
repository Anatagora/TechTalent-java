import javax.swing.JOptionPane;

public class T5Ejercicio03App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Modifica la aplicación anterior, para que nos pida el nombre que 
		 * queremos introducir(recuerda usar JOptionPane)
		 */
		String nombre= JOptionPane.showInputDialog("Introduce tu nombre"); 
		JOptionPane.showMessageDialog(null,"Bien, tu nombre es " +nombre); 
	}

}
