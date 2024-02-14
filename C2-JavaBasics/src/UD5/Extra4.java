package UD5;
import java.util.Scanner;

public class Extra4 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Introduce un número");  
		String num = sc.nextLine();
		
		int numero =Integer.parseInt(num); 
		boolean primo=true;
		
		for(int contador=numero; contador>2; contador--) {
			int resto= numero%contador;

			if((resto ==0)) {
				if ((contador != 1)&&(contador != numero)){
					primo=false;
					break;
				}
			}
		}
		if(primo==false) {
			System.out.println("El número " +numero+ " no es primo");
		}else {
			System.out.println("El número " +numero+" si es primo");	
		}

	}
}
