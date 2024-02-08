import java.util.Scanner;

public class Ejercicio4TA5App {

	public static void main(String[] args) {
		/**
		 * Haz una aplicación que calcule el área de un circulo (pi*R2). El radio se pedirá por teclado
		 * (recuerda pasar de String a double con Double.parseDouble). 
		 * Usa la constante PI y el método pow de Math
		 */
		Scanner sc= new Scanner(System.in); 
		System.out.println("Introduce el radio"); 
		
		String num= sc.nextLine(); 
		sc.close(); 
	
		double numDouble=Double.parseDouble(num); 
		
		final double PI=(3.14);
		double area =(PI * numDouble);
		
		System.out.println("Área del circulo: \n " +area); 
		
	}

}
