package UD6;

import java.util.Scanner;

public class T6Ejercicio06App {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		System.out.println("Introduce un número entero positivo");
		String num = sc.nextLine();   
		int nCifras= cifras(num); 
	 
		System.out.println("El número de cifras de "+num+ " es "+nCifras);
		
		sc.close();
	}
	
	public static int cifras(String n1) {
		int resultado = n1.length();
		
		return resultado; 
	}
}
