package UD8;

public class ud8Coche {
	private String marca; 
	private String modelo; 
	private int año; 
	private String color; 

	// Constructores 
	public ud8Coche() 
	{
		this.marca =""; 
		this.modelo =""; 
		this.año =0; 
		this.color= "";
	}
		
		
	public ud8Coche (String, String modelo, int año, String color) 
	{
		this.marca =marca; 
		this.modelo = modelo; 
		this.año= año; 
		this.color= color;
	}
	
	public public void arrancar() 
	{
		System.out.println("El coche "+ marca+ " "+modelo+ " ha arrancado.");
	}
	
	public public void detener() 
	{
		System.out.println("El coche "+ marca+ " "+modelo+ " se ha detenido.");
	}
	
	
}
