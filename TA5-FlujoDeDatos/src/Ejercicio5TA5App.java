import javax.swing.JOptionPane;

public class Ejercicio5TA5App {

	public static void main(String[] args) {
		/**
		 *Lee un número por teclado e indica si es divisible entre 2 (resto = 0). 
		 *Si no lo es, también debemos indicarlo. 
		 */
		String num= JOptionPane.showInputDialog("Introduce un número "); 
		int numero= Integer.parseInt(num);
		
		if (numero % 2==0) {
			JOptionPane.showMessageDialog(null, +numero + "Es divisible entre 2");
		}else {
			JOptionPane.showConfirmDialog(null, +numero + "No es divisible entre 2");
		}
		
	}

}
