
public class Ejercicio4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Escribe un programa Java que declare una variable entera N y asígnale un valor. 
		 * A continuación escribe las instrucciones que realicen acciones
		 */
		int N= 1; 
		int suma=N+77;
		int resta=suma-3;
		int multiplicacion=resta*2;
		
		//El valor de N evoluciona en función de las acciones que se hacen, por lo tanto hay que tener en cuenta dichas acciones
		// Lo que se quiere mostrar varia en función de la operación anteriormente realizada
		
		System.out.println("Valor inicial de N: "+ N);
		System.out.println("Suma N+77: "+ suma);
		System.out.println("Resta N-3: "+ resta);
		System.out.println("Doble de N: "+ multiplicacion);
		
	}

}
