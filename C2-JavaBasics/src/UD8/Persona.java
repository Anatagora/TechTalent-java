package UD8;

public class Persona 
{
	private String nombre; 
	private int edad; 
	private String DNI; 
	private final String sexo; 
	private double peso; 
	private double altura; 
	
	public Persona()
	{
	this.nombre =" ## "; 
	this.edad= 0; 
	this.DNI= " ## "; 
	this.sexo= " hombre "; 
	this.peso = 0.0; 
	this.altura =0.0; 
	
	}
	
	public Persona(String nombre, int edad)
	{
	this.nombre =" nombre "; 
	this.edad= edad; 
	this.DNI= " ## "; 
	this.sexo= " hombre "; 
	this.peso = 0.0; 
	this.altura =0.0;
	}
	
	public Persona(String nombre, int edad, String dni, double peso, double altura)
	{
	this.nombre =" nombre "; 
	this.edad= edad; 
	this.DNI= " dni "; 
	this.sexo= " hombre "; 
	this.peso = peso; 
	this.altura =altura;
	}
	
}
