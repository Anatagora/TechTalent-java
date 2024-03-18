package UD8;

public class mainApp {

	public static void main(String[] args) 
	{
		// Persona 
		Persona persona1 = new Persona(); 
		persona1.mostrar();
		
		Persona persona2 = new Persona("Kevin", 29);
		persona2.mostrar();
		
		Persona persona3 = new Persona("Manolo", 32,"75693207c", 80,1.8);
		persona3.mostrar();
		System.out.println("\n");
		
		// Password 
		Password2 passwordTest1 = new Password2(5);
		System.out.println("Your password 1 is: " + passwordTest1.toString());
		
		Password2 passwordTest2 = new Password2();
		System.out.println("Your password 2 is: " + passwordTest2.toString());
		System.out.println("\n");
		
		// Electrodomestico 
		Electrodomestico electrodomestico1 = new Electrodomestico(); 
		electrodomestico1.mostrar();
		
		Electrodomestico electrodomestico2 = new Electrodomestico(105, 32);
		electrodomestico2.mostrar();
		
		Electrodomestico electrodomestico3 = new Electrodomestico(125, "Rojo", "A", 32);
		electrodomestico3.mostrar();
		System.out.println("\n");
		
		// Serie 
		Serie serie1 = new Serie (); 
		serie1.mostrar(); 
		
		Serie serie2 = new Serie ("Las locas aventuras de M.Rajoy", "M.Rajoy"); 
		serie2.mostrar();
		
		Serie serie3 = new Serie("Oh no! Elecciones otra vez", 2, "Comedia politica", "Pere Aragonès"); 
		serie3.mostrar();
		
		Serie serie4 = new Serie("The Office", 9, "Comedia", "Ricky Gervais"); 
		serie4.mostrar();

	}

}
