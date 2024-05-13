package UD10;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio01 {
    private int numeroAdivinar;
    private int intentos;

    public Ejercicio01() {
        Random rand = new Random();
        this.numeroAdivinar = rand.nextInt(500) + 1;
        this.intentos = 0;
    }

    public void iniciarJuego() {
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Introduce un número entre 1 y 500: ");
                int intento = scanner.nextInt();
                this.intentos++;
                
                if (intento == this.numeroAdivinar) {
                    System.out.println("¡Felicidades! Has adivinado el número en " + this.intentos + " intentos.");
                    break;
                } else if (intento < this.numeroAdivinar) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("El número a es menor.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Ingressa un número válido.");
                scanner.next(); // Limpiar el buffer del scanner para evitar un bucle infinito
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
    	Ejercicio01 juego = new Ejercicio01();
        juego.iniciarJuego();
    }
}

