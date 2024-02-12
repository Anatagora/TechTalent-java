import java.util.Scanner;

public class T5Ejercicio12App {

	public static void main(String[] args) {
		
		String contraseñaCorrecta = "1234"; 
		int numeroIntentos =3;
		
		for(int intento =1; intento<=numeroIntentos; intento++ ) {
			Scanner sc= new Scanner(System.in); 
			System.out.println("Introduce la contraseña ");  
			String cont = sc.nextLine(); 
		
			if (cont == contraseñaCorrecta) {
				System.out.println("Contraseña correcta");
				break;
			} else {
				System.out.println("Contraseña incorrecta");
			}
			
			if(intento== numeroIntentos) {
				System.out.println("No te quedan más intentos.");
			}
		}
	}
}
