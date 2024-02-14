package UD5;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class T5Ejercicio04App {

	public static void main(String[] args) {
		/**
		 * Haz una aplicación que calcule el área de un circulo (pi*R2). El radio se pedirá por teclado
		 * (recuerda pasar de String a double con Double.parseDouble). 
		 * Usa la constante PI y el método pow de Math
		 */
		//		double radio = Double.parseDouble(JOption.Pane.showInputDialog(
		//		"Introduce un radio: ")); 
		//final double PI= 3.14; 
		//
		//double area= PI*(Math.pow(radio,2)); 
		//JOptionPane.showMessageDialog(null, "El área del " +
		//"circulo es " +area)
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Introduce el radio"); 
		
		String num= sc.nextLine(); 
		sc.close(); 
	
		double numDouble=Double.parseDouble(num); 
		
		final double PI=(3.14);
		double area =PI *Math.pow(numDouble, 2);
		
		System.out.println("Área del circulo: \n " +area); 
		
	}

}
