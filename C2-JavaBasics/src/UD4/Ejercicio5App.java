package UD4;


public class Ejercicio5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Programa java que declare cuatro variables A,B,C y D, y asígnale un valor a cada una. A continuación realiza 
		 * las instrucciones necesarias para que se realicen las diferentes acciones.
		 */
		int A=15;
		int B=560;
		int C=25;
		int D=36; 
		int antiguoB=B;
		
		B=C; 
		C=A; 
		A=D; 
		D=B; 
		D=antiguoB;
		
		 System.out.println("Valor de B: "+B+
				 "\n"+ "Valor de C: "+C +
				 "\n"+ "Valor de A: "+A +
				 "\n"+ "Valor de D: "+antiguoB); 
		 
		 
		// Los valores toman el valor inicial?? O por el contrario, es una cuestión secuencial y toma el valor actual ??
	}

}
