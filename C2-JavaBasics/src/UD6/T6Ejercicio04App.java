package UD6;

import java.util.Scanner;

public class T6Ejercicio04App {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Introduce un número");  
		String num = sc.nextLine(); 
	
		int numero =Integer.parseInt(num);
		System.out.println(Factorial(numero));
	}
	
	public static int Factorial(int n1) {
		int fact=1; 
		
		while (n1>0) {
			fact = fact * n1;
			n1--;
		}
	
		return fact; 
	}
}
