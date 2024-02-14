package UD6;

public class Array {

	public static void main(String[] args) {
	
		int num1[] = {5,6,5,2,3};  
		// Declarando variable de tipo array y asignando valores
		
		int num2[] = new int [5]; 
		// Declarando tipo Array y tamaño 5 (todos los valores 0)
		// asignando valores int num2 y tamaño 5 
		//num2[] = {0,0,0,0,0}
		
		
		num2[0] =5; //Asignación del valor 5 en la 1ª posición
		num2[1] =9; 
		
		System.out.println(num1 [3]); 
		System.out.println(num2 [1]);
	}

}
