package UD9;

public class ElectrodomesticoMainApp {

	public static void main(String[] args) 
	{
		
		ElectrodomesticoUD9 ArrayE[]= new ElectrodomesticoUD9 [10]; 
		 
		
		// clase hija Lavadora
		
		Lavadora Lavadora1 = new Lavadora(200, "Amarillo", 'A', 25,35);
		Lavadora Lavadora2 = new Lavadora(200, "Rojo", 'C', 80,25);
		Lavadora Lavadora3 = new Lavadora(200, "Gris", 'B', 85,30);
		Lavadora Lavadora4 = new Lavadora(200, "Azul", 'B', 70,15);
		Lavadora Lavadora5 = new Lavadora(200, "Blanco", 'B', 85,30);
		
		Lavadora1.mostrar();
		System.out.println("\n");
		
		//clase hija Televisión 
		Television Television1 = new Television (100, "Gris", 'A', 25, 60,false);
		Television Television2 = new Television (105, "Blanco", 'F', 25, 32,false);
		Television Television3 = new Television (105, "Rojo", 'C', 25, 20,false);
		Television Television4 = new Television (105, "Rojo", 'C', 25, 20,false);
		Television Television5 = new Television (105, "Rojo", 'C', 25, 20,false);
		
		ArrayE[0] = Lavadora4; 
		ArrayE[1] = Lavadora5; 
		ArrayE[2] = Television4; 
		ArrayE[3] = Television5; 
		ArrayE[4] = Lavadora1; 
		ArrayE[5] = Lavadora2; 
		ArrayE[6] = Lavadora3; 
		ArrayE[7] = Television1; 
		ArrayE[8] = Television2; 
		ArrayE[9] = Television3; 
		
		for (ElectrodomesticoUD9 electrodomesticoUD9 : ArrayE) 
		{
			ElectrodomesticoUD9.precioFinal(); 
		}
	

	}

}
