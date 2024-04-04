package UD9.Ejercicio4;

public class Main 
{

	public static void main(String[] args) 
	{
		// No lo pide, pero hago un ejemplo de la usabilidad del código.
		Raices ecuacion =new Raices(-6,4,6); 
		System.out.println("¿Discriminante? " +ecuacion.getDiscriminante());
		System.out.println("¿Tiene raíces? "+ecuacion.tieneRaices() );
		System.out.println("¿Tiene una única raíz? " +ecuacion.tieneRaiz());
		
		ecuacion.calcular();
		ecuacion.obtenerRaices();
		ecuacion.obtenerRaiz();

	}

}
