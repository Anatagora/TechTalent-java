import java.util.Scanner;

public class Extra3 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in); 
		System.out.println("Introduce un número");  
		String num = sc.nextLine(); 
	
	int numero =Integer.parseInt(num);
	int suma=0;
	
		while (numero>0) {
		suma = suma + numero;
		numero--;
		}
		System.out.println("La suma es "+suma); 
	}
}
