package UD9.Ejercicio5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Estudiantes extends Persona
{
	//Atributos
	protected List<Integer>calificaciones = (List<Integer>) Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
	protected int calificacion_actual; 
	
	//Constructores
	public Estudiantes() 
	{
		super(); 
		this.calificacion_actual=0; 
	}
	public Estudiantes(int nota) 
	{
		super(); 
		this.calificacion_actual=nota; 
	}
	
	public Estudiantes(String nombre, int edad,char sexo, int nota) 
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
}
