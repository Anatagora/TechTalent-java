package UD9;


public class MainApp {

	public static void main(String[] args) {
		// Electrodomestico Clase Padre 
		
		ElectrodomesticoUD9 electrodomestico1 = new ElectrodomesticoUD9(); 
		electrodomestico1.mostrar();
		
		ElectrodomesticoUD9 electrodomestico2 = new ElectrodomesticoUD9(105, 32);
		electrodomestico2.mostrar();
		
		ElectrodomesticoUD9 electrodomestico3 = new ElectrodomesticoUD9(125, "Verde", 'H', 32);
		electrodomestico3.mostrar();
		
		ElectrodomesticoUD9 electrodomestico4 = new ElectrodomesticoUD9(200, "Amarillo", 'J', 25);
		electrodomestico4.mostrar();
		System.out.println("\n");

	}

}
