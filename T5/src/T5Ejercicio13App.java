import java.util.Scanner;

public class T5Ejercicio13App {

	public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in); 
	System.out.println("Introduce un número");  
	String operando1 = sc.nextLine(); 
	//sc.close(); 
	
	Scanner sc1= new Scanner(System.in); 
	System.out.println("Introduce otro número");  
	String operando2 = sc1.nextLine(); 
	//sc1.close(); 
	
	Scanner sc2= new Scanner(System.in); 
	System.out.println("Introduce el signo de la operación que deseas realizar (+,-,*,/,^,%)");  
	String signo = sc2.nextLine(); 
	//sc2.close(); 
	
	double numInt = Integer.parseInt(operando1); 
	double numInt2 = Integer.parseInt(operando2);  
	String signoOperacion = signo; 
	
	double resultado=0; 
	
	switch (signoOperacion) {
	case "+": 
		resultado= numInt + numInt2;
		break;
	case "-": 
		resultado= numInt - numInt2;
		break;
	case "*": 
		resultado= numInt * numInt2;
		break;
	case "/": 
		resultado= numInt / numInt2;
		break;
	case "^": 
		resultado= Math.pow(numInt, numInt2);
		break;
	case "%": 
		resultado= numInt % numInt2;
		break;
		default: 
			System.out.println("error"); 
	}
	System.out.println("El resultado es " + resultado); 
	}

}
