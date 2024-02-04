
public class Ejercicio3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** Escribe un programa Java que realice lo siguiente: declarar 2 varibles X e Y de tipo int,
		 *  2 variables N y M de tipo double y asigna a cada una un valor. A continuación muestra 
		 *  por pantalla diferentes acciones
		*/
		int X=25;
		int Y=30;
		double N= 20.69;
		double M=8.963;
		
		System.out.println("Variable X: "+ X);
		System.out.println("Variable Y: "+ Y);
		System.out.println("Variable N: "+ N);
		System.out.println("Variable M: "+ M);	
		
		int suma=X+Y;
		int resta=X-Y;
		int multiplicación=X*Y;
		int división=X/Y;
		int resto=X%Y;
		
		System.out.println("Suma X+Y: "+ suma);
		System.out.println("Resta X-Y: "+ resta);
		System.out.println("Multiplicación X*Y: "+ multiplicación);
		System.out.println("División X/Y: "+ división);
		System.out.println("Resto X%Y: "+ resto);
		
		double suma1=N+M;
		double resta1=N-M;
		double multiplicación1=N*M;
		double división1=N/M;
		double resto1=N%M;
		
		System.out.println("Suma: "+ suma1);
		System.out.println("Resta N-M: "+ resta1);
		System.out.println("Multiplicación N*M: "+ multiplicación1);
		System.out.println("División N/M: "+ división1);
		System.out.println("Resto N%M: "+ resto1);
			
		double suma2=X+N;
		double división2=Y/M;
		double resto2=Y%M;
		
		System.out.println("Suma X+N: "+ suma2);
		System.out.println("División Y/M: "+ división2);
		System.out.println("Resto Y%M: "+ resto2);
		
		int doble=X*2;
		int doble1=Y*2;
		double doble2=N*2;
		double doble3=M*2;
		
		System.out.println("Doble X: "+ doble);
		System.out.println("Doble Y: "+ doble1);
		System.out.println("Doble N: "+ doble2);
		System.out.println("Doble M: "+ doble3);
					
		double sumaTotal=X+Y+N+M;
		double multiplicaciónTotal=X*Y*N*M;
		
		System.out.println("Suma de todas las variables: "+ sumaTotal);
		System.out.println("Producto de todas las variables: "+ multiplicaciónTotal);
						
			
				
				
	}

}
