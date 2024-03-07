package UD8;

public class Frutas {
	
	// Atributos
	String nombre; 
	String color; 
	double precio; 
	
	// Constructores 
	public Frutas() 
	{
		this.nombre = "##";
		this.color = "##";
		this.precio = 0.0;
	}
	
	public Frutas(String n) 
	{
		this.nombre = n;
		this.color = "##";
		this.precio = 0.0;
	}
	
	public Frutas(String n, String c) 
	{
		this.nombre = n;
		this.color = c;
		this.precio = 0.0;
	}
	
	public Frutas(String n, double q) 
	{
		this.nombre = n;
		this.color = "##";
		this.precio = q;
	}
	
	public Frutas(String n, String c, double q) 
	{
		this.nombre = n;
		this.color = c;
		this.precio = q;
	}
	// Métodos 
	
	
	public static void main (String[] args) {
		Frutas manzana = new Frutas(); 
		Frutas platano = new Frutas("Plátano");
		Frutas arandanos = new Frutas("Arandanos","lila");
		Frutas albaricoque = new Frutas("Albaricoque", "Naranja", 10.15);
		
		System.out.println("mi primera fruta tiene el nombre:" + manzana.nombre
				+" y tiene un color igual a "+manzana.color + 
				" tiene un precio de " + manzana.precio +"€");  
		
		System.out.println("mi primera fruta tiene el nombre:" + platano.nombre
				+" y tiene un color igual a "+platano.color + 
				"tiene un precio de " + platano.precio +"€");  
		
		System.out.println("mi primera fruta tiene el nombre:" + arandanos.nombre
				+" y tiene un color igual a "+arandanos.color + 
				" tiene un precio de " + arandanos.precio +"€"); 
		
		System.out.println("mi primera fruta tiene el nombre:" + albaricoque.nombre
				+" y tiene un color igual a "+albaricoque.color + 
				" tiene un precio de " + albaricoque.precio +"€");  
	
		//Reasignar valores 
		
		manzana.nombre ="Manzana"; 
		manzana.color = "amarilla"; 
		manzana.precio = 2.35; 
		System.out.println("mi primera fruta tiene el nombre:" + manzana.nombre
				+" y tiene un color igual a "+manzana.color + 
				" tiene un precio de " + manzana.precio +"€");
	}
	
	
}
