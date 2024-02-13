import java.util.Scanner;

public class T5Ejercicio12App {

	public static void main(String[] args) {
		
		String pass = "1234"; 
		int numeroIntentos =3;
		
		for(int cont =1; cont<=numeroIntentos; cont++ ) {
			Scanner sc= new Scanner(System.in); 
			System.out.println("Introduce la contraseña ");  
			String pass1 = sc.nextLine(); 
		
			if (pass1.equals(pass)) {
				System.out.println("¡Enhorabuena! Contraseña correcta");
				break;
			} else {
				System.out.println("Contraseña incorrecta");
			}
			
			if(cont== numeroIntentos) {
				System.out.println("No te quedan más intentos.");
			}
		}
	}
}
