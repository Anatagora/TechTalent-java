package UD6;

import java.util.Random;
import java.util.Scanner;

public class T6Ejercicio10App {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Indica el tamaño del array");
		int tamanno = sc.nextInt(); 
		
		int n1[] = new int[tamanno];
		
		llenarArrayRandom(n1); 
		mostrarValores(n1);
		System.out.println("\nEl valor máximo es: "+valorMaximo(n1));
		sc.close();
	}
	public static void llenarArrayRandom(int[]array) {
		Random random= new Random();
		Scanner sc= new Scanner(System.in); 
		System.out.println("Indica el primer valor inicial del rango");
		int rangoInicial = sc.nextInt(); 
		
		Scanner sc1= new Scanner(System.in); 
		System.out.println("Indica el valor final del rango ");
		int rangoFinal = sc1.nextInt(); 
		
		for (int i = 0; i < array.length; i++) {
			int posibleNumero = random.nextInt(rangoInicial,rangoFinal);
			while (esPrimo(posibleNumero) == false) {
			posibleNumero= random.nextInt(rangoInicial,rangoFinal);	
			}
				array[i] = posibleNumero;
		}
		sc.close();
		sc1.close();
	}
	
	 public static boolean esPrimo(int n1) {
	        boolean resultado = true;

	        for (int i = 2; i < n1; i++) {
	            if (n1 % i == 0) {
	                resultado = false;
	                break;
	            }
	        }

	        return resultado && n1 > 1;
	   }

	 public static int valorMaximo(int[]array) {
		 int maximo= array[0];
		 for (int i = 1; i < array.length; i++) {
			 if(array[i]>maximo) {
				 maximo= array[i];
			 } 
		}
		return maximo;
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
