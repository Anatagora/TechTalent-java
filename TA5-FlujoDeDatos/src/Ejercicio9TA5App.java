
public class Ejercicio9TA5App {

	public static void main(String[] args) {
		/**
		 * Muestra los números del 1 al 100(ambos incluidos) divisible
		 * entre 2 y 3. Utiliza el bucle que desees. 
		 */
		
		  for (int num = 1; num < 101; num++) {
	            if (num % 2 == 0 && num % 3 == 0) {
	                System.out.println("Divisible entre 2 y 3: " + num);
	            } else if (num % 2 == 0) {
	                System.out.println("Divisible entre 2: " + num);
	            } else if (num % 3 == 0) {
	                System.out.println("Divisible entre 3: " + num);
	            } else {
	                System.out.println("No divisible entre 2 o 3: " + num);
	            }
	        }
	    }
	}
