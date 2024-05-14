package UD10;

import java.util.Random;

//Definición de la excepción personalizada para números pares
	class NumeroParException extends Exception 
	{
	public NumeroParException(String message) 
		{
		super(message);
		}
	}

//Clase principal que genera un número aleatorio y determina si es par o impar

	class Ejercicio03_par_impar {
	// Método para generar un número aleatorio entre 0 y 999

	public int generarNumeroAleatorio() {
		Random rand = new Random();
		return rand.nextInt(1000); // Se generará un número entre 0 y 999
	}

	// Método para determinar si un número es par o impar
	public void determinarParidad(int numero) throws NumeroParException 
	{
		if (numero % 2 == 0) {
			throw new NumeroParException("El número generado es par: " + numero);
		} else {
			System.out.println("El número generado es impar: " + numero);
		}
	}

	// Método main dentro de la clase Ejercicio03_par_impar
	public static void main(String[] args) {
		Ejercicio03_par_impar generador = new Ejercicio03_par_impar();

		try {
			int numeroAleatorio = generador.generarNumeroAleatorio();
			generador.determinarParidad(numeroAleatorio);
		} catch (NumeroParException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Programa finalizado!");
		}
	}
}
