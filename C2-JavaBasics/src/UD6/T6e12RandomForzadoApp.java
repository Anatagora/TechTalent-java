package UD6;

import java.util.Random;
import java.util.Scanner;

public class T6e12RandomForzadoApp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Indica el tamaño del array");
		int tamaño = sc.nextInt(); 
		
		Scanner sc1= new Scanner(System.in); 
		System.out.println("Indica el digito en el que quieres que acaben los randoms");
		int numPedido = sc1.nextInt(); 
		
		int array[] = new int[tamaño];
		
		llenarArrayRandom(array, numPedido);
		mostrarValores(array);
		
		sc.close();
		sc1.close();
	}
	public static void llenarArrayRandom(int[]array, int num) {
		Random random= new Random();
		
		for (int i = 0; i < array.length; i++) {
			int randomGenerado= random.nextInt(1,300);
			while (digitoAcabado(randomGenerado, num)==false) {
				randomGenerado= random.nextInt(1,300);
				
			}
			array[i] =randomGenerado; 
		}
	}
	
	public static boolean digitoAcabado (int rGenerado, int num) {
		String numString = String.valueOf(num);
		String rGen= String.valueOf(rGenerado);
		
		char posicionValorGenerado= rGen.charAt(rGen.length()-1); 
		String ultimoNumero = String.valueOf(posicionValorGenerado);

		boolean comparacion= ultimoNumero.equals(numString);
		
		return comparacion;
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
