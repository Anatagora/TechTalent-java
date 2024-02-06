import java.util.Scanner; 

public class Prueba1TA5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("-- Bienvenido a JAVA --");
		System.out.println("Introduce tu nombre:");
		
		String name = sc.nextLine();
//		sc.close();
		
		System.out.println("Hola " + name.toUpperCase());
		
		//Otro ejemplo con enteros
		System.out.println("Introduce tu edad:");
		
		int num = sc.nextInt();
		sc.close();
		
		System.out.println("Tu edad es " + num);
	}

}
