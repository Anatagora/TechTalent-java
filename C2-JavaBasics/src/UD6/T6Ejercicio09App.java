package UD6;

import java.util.Random;
import java.util.Scanner;

public class T6Ejercicio09App {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in); 
		System.out.println("Indica el tamaño del array");
		int tamaño = sc.nextInt(); 
		
		int n1[] = new int[tamaño]; 
		llenarArrayRandom(n1); 
		int suma = sumarValores(n1);
		
		System.out.println("La suma de todos los valores es " +suma );
		
		sc.close();
	}
	
	public static void llenarArrayRandom(int[]array) {
		Random random= new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] =random.nextInt(10); 
		}
		
	}
	public static int sumarValores(int[] array) {
		
		int suma=0; 
		for (int i = 0; i < array.length; i++) {
			//añadir if, if else, else para el system out y que se vea como un array if(i==0)
			System.out.println("Valor" +(i+1)+": "+array[i]);
			suma = array[i]+ suma; // suma+= array[i] se suma sobre si mismo
			
		}
		return suma;
	}
	
}
