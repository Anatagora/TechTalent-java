
public class MetodosApp {

	public static void main(String[] args) {
	int operador1 =3, operador2=5; 
	int resultado= sumaNumeros(operador1, operador2);
	System.out.println("El resultado de la suma es " +resultado);
	
	if(positivo(resultado)) {
		System.out.println("El resultado es mayor o igual que 0");
		
	}else {
		System.out.println("El resultado es negativo"); 
		}
	}
	public static int sumaNumeros(int num1, int num2) {
		
		return num1+num2; 
		}
	
	public static boolean positivo(int param1) {
		if(param1>=0) { 
			return true;
		}else { 
			return false; 
		}
		
	}

}
