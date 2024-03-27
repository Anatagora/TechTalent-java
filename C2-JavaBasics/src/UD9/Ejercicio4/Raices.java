package UD9.Ejercicio4;

public class Raices {

	double a; 
	double b; 
	double c; 
	
	//Constructores 
	public Raices()
	{
		this.a=0.0; 
		this.b=0.0; 
		this.c=0.0; 
	}
	
	public Raices(double a, double b, double c)
	{
		this.a=a; 
		this.b=b; 
		this.c=c; 
	}
	
	//Métodos 
	
	public double getDiscriminante()
	{
		 return (b*2)-(4*a*c); 
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public boolean tieneRaices() 
	{
		return getDiscriminante()>0; 
	}
	
	public boolean tieneRaiz() 
	{
		return getDiscriminante()==0; 
	}
	
	public void calcular() 
	{
		if(tieneRaices()) {
			obtenerRaices();
		}else if(tieneRaiz()) {
			obtenerRaiz(); 
		}else {
			System.out.println("No hay solución de la ecuación");
		}
	}
	
	public void obtenerRaices() 
	{
		double raiz1=0; 
		double raiz2=0;
		
		raiz1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
		raiz2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
		
		System.out.println("Raiz 1: " +raiz1);
		System.out.println("Raiz 2: " +raiz2);
	}
	
	public void obtenerRaiz() 
	{
		double raiz =(-b + Math.sqrt(getDiscriminante())) / (2 * a);
		System.out.println("La raiz es: " +raiz);
	}
}
