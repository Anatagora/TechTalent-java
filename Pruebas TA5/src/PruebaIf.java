import java.util.Scanner;

public class PruebaIf {

	public static void main(String[] args) {
		// Ejercicio horas del día 
		//Variable "hora" de tipo int con rango del 0 (12 noche)
		// al 23(11 de la noche)
		// Con un condicional que diga buenos días, buenas tardes y buenas noches 
		// 1-11= Buenos días 12-19 =Buenas tardes 20-23= Buenas noches
	
		Scanner sc= new Scanner(System.in); 
		System.out.println("Introduce la hora que es "); 
		
		int hora= sc.nextInt(); 
		sc.close();  
		
		
//		int hora= 11;
		if((hora>=1)&&(hora<=11)) {
			System.out.println("Buenos días");
		}else if((hora>=12)&&(hora<=19)) {
			System.out.println("Buenas tardes"); 
		}else if((hora>=20)&&(hora<=23)) {
			System.out.println("Buenas noches");
		}
	}

}
