package UD6;

import java.util.Random;
import java.util.Scanner;

public class T6Ejercicio11App {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Indica el tamaño del array");
		int size = sc.nextInt(); 
		
		int array1[] = new int[size];
		int array2[] = new int[size]; 
		int newArray[]= new int [size];  
		
		
		llenarArrayRandom(array1);
		mostrarValores(array1); 
		
		rellenarArray2(array1, array2);
		mostrarValores(array2);
		
		newArray= multiplicaArray(array1, array2);
		mostrarValores(newArray);
		
		sc.close();
	}
	public static void llenarArrayRandom(int[]array) {
		Random random= new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] =random.nextInt(100); 
		}
		
	}
	
	public static void rellenarArray2(int[] a1, int[] a2) {
		Random random= new Random(); 
		
		for (int i = 0; i < a2.length; i++) {
			a2[i]= a1[i]*random.nextInt(100);
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
	 public static int[] multiplicaArray(int[] a1, int[] a2) {
		 int newArray[] = new int[a1.length];
		 for (int i = 0; i < newArray.length; i++) {
			newArray[i]= a1[i] * a2[i]; 
		}
		 return newArray; 
	 }
}
