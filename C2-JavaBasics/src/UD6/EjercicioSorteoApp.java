package UD6;

import java.util.Scanner;

public class EjercicioSorteoApp {

	public static void main(String[] args) {
	// Ejercicio del sorteo 
	// Pedir 3 strings por pantalla 
	// Realizar un recorrido del array y mostrar los 3 participantes 
	// En una lista y a continuación con método Mat.random 
	// rango del indice 0 al 0 (lenght-1) te arroje un ganador. 
		
		 Scanner scanner = new Scanner(System.in);
	        String[] participantes = new String[3];

	        // Pedir los nombres de los participantes
	        for (int i = 0; i < participantes.length; i++) {
	            System.out.print("Ingrese el nombre del participante " + (i + 1) + ": ");
	            participantes[i] = scanner.nextLine();
	        }

	        // Mostrar los participantes
	        System.out.println("\nLista de participantes:");
	        for (String participante : participantes) {
	            System.out.println("- " + participante);
	        }

	        // Realizar el sorteo
	        int indiceGanador = (int) (Math.random() * participantes.length);
	        String ganador = participantes[indiceGanador];
	        System.out.println("\n¡El ganador del sorteo es: " + ganador + "!");
	    }
	}
