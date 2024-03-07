package UD6;

import javax.swing.JOptionPane;

public class T6e01PoligonosApp {

	public static void main(String[] args) {

		String poligono = JOptionPane
				.showInputDialog("Introduce un polígono: ");
		
		switch (poligono.toLowerCase()) {
			case "circulo":
				double var1 = Double.parseDouble(JOptionPane
						.showInputDialog("Dame el radio: "));
				
				double resultado=Math.round(circulo(var1));
				JOptionPane.showMessageDialog(null, "El resultado del "
						+ "área del circulo es: " 
						+ resultado);
				break;
			
			case "triangulo":
				
				double var2 = Double.parseDouble(JOptionPane
						.showInputDialog("Dame la base: "));
				double var3 = Double.parseDouble(JOptionPane
						.showInputDialog("Dame la altura: "));
				
				double resultado2=Math.round(triangulo(var2, var3));
				JOptionPane.showMessageDialog(null, "El resultado del "
						+ "área del triangulo es: " 
						+ resultado2);
				break;
				
			case "cuadrado":
			
				double var4 = Double.parseDouble(JOptionPane
						.showInputDialog("Dame un lado: "));
				
				double resultado3=Math.round(cuadrado(var4));
				JOptionPane.showMessageDialog(null, "El resultado del "
						+ "área del cuadrado es: " 
						+ resultado3);
				break;

			default:
				JOptionPane.showMessageDialog(null, 
						"Esto no es un polígono");
				//Se pediria en un bucle de nuevo introduce el poligono
//				poligono = JOptionPane
//						.showInputDialog("Introduce un polígono: ");
				break;
		}
		
	}
	
	public static double circulo(double radio) {
		return (Math.pow(radio, 2))*Math.PI;
	}
	public static double triangulo(double base, double altura) {
		return (base * altura) / 2;
	}
	public static double cuadrado(double lado) {
		return (lado * lado);
	}

}
	


