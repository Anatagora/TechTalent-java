import javax.swing.JOptionPane;

public class T5Ejercicio06App {

	public static void main(String[] args) {
	/**
	 * Lee un número por teclado que pida el precio de un producto 
	 * (puede tener decimales) y calcule el precio final con IVA. 
	 * El IVA sera una constante que sera del 21%
	 */
	
	
	double precio = Double.parseDouble(JOptionPane.showInputDialog(
			"Introduce precio del producto ")); 
	final double IVA=(0.21);  
	double precioFinal = (precio* IVA)+ precio; 
	
	JOptionPane.showMessageDialog(null, 
			"Precio final con IVA  " +precioFinal); 

	
	}

}
