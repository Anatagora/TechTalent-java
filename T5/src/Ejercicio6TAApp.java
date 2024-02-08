import javax.swing.JOptionPane;

public class Ejercicio6TAApp {

	public static void main(String[] args) {
	/**
	 * Lee un número por teclado que pida el precio de un producto 
	 * (puede tener decimales) y calcule el precio final con IVA. 
	 * El IVA sera una constante que sera del 21%
	 */
	
	String precio= JOptionPane.showInputDialog("Introduce precio del producto ");
	
	double precio1 = Double.parseDouble(precio); 
	final double IVA=(0.21);  
	double precioFinal = (precio1* IVA)+ precio1; 
	
	JOptionPane.showMessageDialog(null,"Precio final con IVA  " +precioFinal); 

	
	}

}
