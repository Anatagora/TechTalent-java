package UD6;

import java.util.Scanner;

public class T6e03PrimoApp {

	public static void main(String[] args) {
	
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Introduce un número");
	        String num = sc.nextLine();

	        int numero = Integer.parseInt(num);

	        if (primo(numero)) {
	            System.out.println("El número " + numero + " es primo");
	        } else {
	            System.out.println("El número " + numero + " no es primo");
	        }
	        sc.close();
	    }

	    public static boolean primo(int n1) {
	        boolean resultado = true;

	        for (int i = 2; i < n1; i++) {
	            if (n1 % i == 0) {
	                resultado = false;
	                break;
	            }
	        }

	        return resultado && n1 > 1;
	   }
	
}

