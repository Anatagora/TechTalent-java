package UD6;

import javax.swing.JOptionPane;

public class T6Ejercicio1App {

	public static void main(String[] args) {
		
		String poligono= JOptionPane
				.showInputDialog("Introduce un polígono");
		
		switch (poligono.toLowerCase()) {
		case "circulo":
			// 1.Crear variable(s) de parametro(s)
			// 2. Pedir los valores
			double var1= Double.parseDouble(JOptionPane.showInputDialog("Dame el radio: ")); 
			
			// 3. Llamar al método
			double resultado=circulo(var1); 
			System.out.println("El resultado del cálculo es: " +resultado);
			
			break; 
		case "triangulo": 
			double var2=Double.parseDouble(JOptionPane.showInputDialod("Dame la base"));
			double var3=;
			break; 
		
		case "cuadrado": 
			
			break; 
			
		default: 
			System.out.println("Esto no es un polígono");
			break; 
		}
	
	}
	
	public static double circulo(double radio) {
		return(radio*(radio))*Math.PI; 
	
	}
	public static double triangulo (double base, double altura) {
		return(base*altura)/2; 
	}
	public static double cuadrado(double lado) {
		return(lado*lado); 
	
	}
		
	
}
	


