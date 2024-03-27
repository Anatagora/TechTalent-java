package UD9.Ejercicio5;

public class Aula 
{
	//Atributos 
	private int nAula; 
	private int max_Capacidad; 
	private String materia; 
	private Profesor profesor; 
	private Estudiantes[] estudiantes; 
	private int nEstudiantes; 
	
	//Constructores 
	public Aula(int num, int capacidad, String asignatura, Profesor profesor) 
	{
		this.nAula =num; 
		this.max_Capacidad =capacidad; 
		this.materia= asignatura; 
		this.profesor =profesor; 
		this.estudiantes = new Estudiantes[max_Capacidad]; 
		this.nEstudiantes =0; 	
	}
	
	
}
