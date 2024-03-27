package UD9.Ejercicio5;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Profesor extends Persona
{
	//Atributos 
	protected List<String>materias_disponibles = (List<String>) Arrays.asList("matemáticas","filosofía", "física");
	protected String materia; 
	
	//Constructores 
	
	public Profesor() 
	{
		super(); 
		this.materia="none";
	}
	
	public Profesor(String nombre, int edad,char sexo,String asignatura) 
	{
		super(nombre, edad, sexo); 
		this.materia="none";
	}
	
	//Métodos 
	public String getMaterias() 
	{
		return materia;
	}

	public void setMaterias(String materias) 
	{
		this.materia = materias;
	}
	
	public boolean polimorfismo() 
	{
		Random random= new Random(); 
		return random.nextDouble()>0.2; 
	}
	
}
