package UD9;

public class ElectrodomesticoMainApp {

	public static void main(String[] args) {
		
		ElectrodomesticoUD9 ArrayE[]= new ElectrodomesticoUD9 [10]; 
		
		
		
		// Instanciacion Electrodomestico Clase Padre 
		
		ElectrodomesticoUD9 electrodomestico1 = new ElectrodomesticoUD9(); 
		electrodomestico1.mostrar();
		
		ElectrodomesticoUD9 electrodomestico2 = new ElectrodomesticoUD9(105, 32);
		electrodomestico2.mostrar();
		
		ElectrodomesticoUD9 electrodomestico3 = new ElectrodomesticoUD9(125, "Verde", 'A', 81);
		electrodomestico3.mostrar();
		
		ElectrodomesticoUD9 electrodomestico4 = new ElectrodomesticoUD9(200, "Amarillo", 'J', 25);
		electrodomestico4.mostrar();
		System.out.println("\n");
		
		// Sub-clase Lavadora
		
		Lavadora Lavadora1 = new Lavadora(200, "Amarillo", 'A', 25,35);
		Lavadora1.mostrar();
		System.out.println("\n");
		

	}

}
