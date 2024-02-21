package UD6;

import java.util.Iterator;
import java.util.Scanner;

public class T6Ejercicio8App {

	public static void main(String[] args) {
	
	int num[]= new int [10]; 
	
	rellenarValores(num); 
	mostrarValores(num); 

	}
	public static void rellenarValores(int[] array) {
	
		Scanner sc= new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce Valor" +(i+1)+": ");
			array[i] = sc.nextInt();
		}
		
		sc.close();
	}
		public static void mostrarValores(int[] array) {
			 System.out.println("Valores introducidos:");
		        for (int i = 0; i < array.length; i++) {
		            System.out.println("Índice " + i + ": " + array[i]);
		}
	}
}
