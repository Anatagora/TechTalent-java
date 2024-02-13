import java.util.Scanner;

public class T5Ejercicio10App {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in); 
		System.out.println("--Introduce el número de ventas--"); 
		
		int ventas= sc.nextInt();	
		double cantidadTotal = 0;
		System.out.println("Has introducido: " + ventas); 
		
		for(int i=0;i< ventas; i++) {
			Scanner sc1= new Scanner(System.in); 
			System.out.println("Introduce la cantidad de la venta " +(i+1)+ " : "); // i+1 porque el contador empieza en cero, y queremos que muestre en orden las ventas
			double cantidadVenta = sc1.nextInt();
			cantidadTotal = cantidadTotal + cantidadVenta;
		}
		System.out.println("Cantidad total de las ventas: "+ cantidadTotal);
	}
}
		
