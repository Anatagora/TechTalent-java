package UD9;

public class ElectrodomesticoMainApp {

	public static void main(String[] args) 
	{
		
		ElectrodomesticoUD9 ArrayE[]= new ElectrodomesticoUD9 [10]; 
		 //Clase padre - Electrodomestico
		
		ElectrodomesticoUD9 Electrodomestico1 = new ElectrodomesticoUD9 (200, "Amarillo", 'A', 25); 
		ElectrodomesticoUD9 Electrodomestico2 = new ElectrodomesticoUD9 (200, "Rojo", 'B', 32);
		ElectrodomesticoUD9 Electrodomestico3 = new ElectrodomesticoUD9 (200, "Amarillo", 'D', 40);
		ElectrodomesticoUD9 Electrodomestico4 = new ElectrodomesticoUD9 (200, "Amarillo", 'F', 58);
		// clase hija Lavadora
		
		Lavadora Lavadora1 = new Lavadora(200, "Amarillo", 'A', 25,35);
		Lavadora Lavadora2 = new Lavadora(200, "Rojo", 'C', 80,25);
		Lavadora Lavadora3 = new Lavadora(200, "Gris", 'B', 85,30);
	
		Lavadora1.mostrar();
		System.out.println("\n");
		
		//clase hija Televisión 
		Television Television1 = new Television (100, "Gris", 'A', 25, 60,false);
		Television Television2 = new Television (105, "Blanco", 'F', 25, 32,false);
		Television Television3 = new Television (105, "Rojo", 'C', 25, 20,false);
		
		
		ArrayE[0] = Electrodomestico1; 
		ArrayE[1] = Electrodomestico2; 
		ArrayE[2] = Electrodomestico3; 
		ArrayE[3] = Electrodomestico4; 
		ArrayE[4] = Lavadora1; 
		ArrayE[5] = Lavadora2; 
		ArrayE[6] = Lavadora3; 
		ArrayE[7] = Television1; 
		ArrayE[8] = Television2; 
		ArrayE[9] = Television3; 
		
		if (Electrodomestico1 instanceof ElectrodomesticoUD9 ) {
			for (ElectrodomesticoUD9 electrodomesticoUD9 : ArrayE) {
				
			}
		} else {

		}

	}

}
