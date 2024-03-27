package UD9.Ejercicio5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Estudiantes extends Persona
{
	//Atributos
	protected List<Integer>calificaciones = (List<Integer>) Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
	protected double calificacion_actual; 
	
	//Constructores
	public Estudiantes() 
	{
		super(); 
		this.calificacion_actual=0; 
	}
	public Estudiantes(double nota) 
	{
		super(); 
		this.calificacion_actual=nota; 
	}
	
	public Estudiantes(String nombre, int edad,char sexo, double nota) 
	{
		super(nombre,edad,sexo); 
		this.calificacion_actual=nota; 
	}
	
	//Métodos 
	public List<Integer> getCalificaciones() 
	{
		return calificaciones;
	}
	public void setCalificaciones(List<Integer> calificaciones) 
	{
		this.calificaciones = calificaciones;
	}
	
	public boolean polimorfismo() 
	{
		Random random= new Random(); 
		return random.nextDouble()>0.5; 
	}
	
	public double getCalificacion_actual() 
	{
		return calificacion_actual;
	}
	
	public void setCalificacion_actual(double calificacion_actual) 
	{
		this.calificacion_actual = calificacion_actual;
	}
	
}
