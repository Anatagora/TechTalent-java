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
		Electrodomestico1.mostrar();
		Electrodomestico2.mostrar();
		Electrodomestico3.mostrar();
		Electrodomestico4.mostrar();
		System.out.println("\n");
		
		// clase hija Lavadora
		
		Lavadora Lavadora1 = new Lavadora(200, "Amarillo", 'A', 25,35);
		Lavadora Lavadora2 = new Lavadora(200, "Rojo", 'C', 80,25);
		Lavadora Lavadora3 = new Lavadora(200, "Gris", 'B', 85,30);
		Lavadora1.mostrar();
		Lavadora2.mostrar();
		Lavadora3.mostrar();
		System.out.println("\n");
		
		//clase hija Televisión 
		Television Television1 = new Television (100, "Gris", 'A', 25, 60,false);
		Television Television2 = new Television (105, "Blanco", 'F', 25, 32,false);
		Television Television3 = new Television (105, "Rojo", 'C', 25, 20,false);
		Television1.mostrar();
		Television2.mostrar();
		Television3.mostrar();
		System.out.println("\n");
		
		
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
		
		double totalTelevisiones = 0;
        double totalLavadoras = 0;
        double totalElectrodomesticos = 0;
		
		for (ElectrodomesticoUD9 electrodomestico : ArrayE) 
		{
			if (electrodomestico instanceof Television) {
				totalTelevisiones += ((Television)electrodomestico).precioFinal();
			} else if (electrodomestico instanceof Lavadora) {
				totalLavadoras += ((Lavadora)electrodomestico).precioFinal();
			}else {
				totalElectrodomesticos += electrodomestico.precioFinal(electrodomestico.getConsumoEnergetico(), electrodomestico.getPeso());
			}
		}

		double total=totalElectrodomesticos +totalTelevisiones +totalLavadoras;
		
		System.out.println("La suma de todas las televisiones es: "+totalTelevisiones);
		System.out.println("La suma de todas las lavadoras es: "+totalLavadoras);
		System.out.println("La suma de todos los electrodomesticos es: "+total);
	}

}
