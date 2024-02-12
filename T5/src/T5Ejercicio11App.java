//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Scanner;

public class T5Ejercicio11App {

	public static void main(String[] args) {
		/**
		 * Crea una aplicación que nos pida un día de la semana y que  nos diga si es un día laboral o no. 
		 * Usa un switch para ello.
		 */
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Introduce el día ");  
		String dia = sc.nextLine(); 
		
		String resultado; 
		
		switch(dia) {
		case "Lunes": 
		case "Martes":
		case "Miércoles":
		case "Jueves":
		case "Viernes":
			resultado = "Hoy es día laboral"; 
			break; 
		case "Sábado":
		case "Domingo":
			resultado = "Hoy no es día laboral"; 
			break; 
		default: 
			resultado =" ERROR ";
	
		}
		System.out.println(resultado);
		sc.close();  
	}

}
