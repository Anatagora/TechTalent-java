package UD6;

import java.util.Random;
import java.util.Scanner;

public class T6Ejercicio12App {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Indica el tamaño del array");
		int tamaño = sc.nextInt(); 
		
		int array[] = new int[tamaño];
		
		llenarArrayRandom(array);
		mostrarValores(array);
		
		sc.close();
	}
	public static void llenarArrayRandom(int[]array) {
		Random random= new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] =random.nextInt(300); 
		}
		
	}
	
	 public static void mostrarValores(int[]array) {
		 for (int i = 0; i < array.length; i++) {
			 if(i==0) {
				 System.out.print("{"+array[i]+", "); 
			 } else if(i< array.length-1) {
				 System.out.print(array[i]+", ");
			 }else {
				 System.out.print(array[i]+"} ");
			 }
			
		}
	 }
}
