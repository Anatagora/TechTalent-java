package UD6;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class T6Ejercicio05App {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in); 
		System.out.println("Introduce un número");  
		String num = sc.nextLine();
		
		int numero =Integer.parseInt(num);
		System.out.println(Binario(numero));
	}

	public static String Binario(int n1) {
		String result =""; 
		int resto=0; 
		do {
			resto= n1%2; 
			n1= n1/2; 
			result = resto + result; 
		}while (n1>0); 
		return result; 
	}
}
