//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Scanner;

public class T5Ejercicio11App {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Introduce el día ");  
		String dia = sc.nextLine(); 
		
//		dia = dia.toLowerCase();
		
		String resultado=""; 
		
		switch(dia) {
		case "lunes": 
		case "martes":
		case "miércoles":
		case "jueves":
		case "viernes":
			resultado = "Hoy es día laboral"; 
			break; 
		case "sábado":
		case "domingo":
			resultado = "Hoy no es día laboral"; 
			break; 
		default: 
			resultado =" ERROR ";
	
		}
		System.out.println(resultado);
		sc.close();  
	}

}
