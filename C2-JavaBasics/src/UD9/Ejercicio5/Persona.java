package UD9.Ejercicio5;

public class Persona 
{
	//Atributos
	protected String nombre; 
	protected int edad; 
	protected char sexo; 
	
	//Constructores
	public Persona() 
	{
		this.nombre= "none"; 
		this.edad =0; 
		this.sexo ='#'; 
	}
	
	public Persona(String n, int e, char s) 
	{
		this.nombre= n; 
		this.edad =e; 
		this.sexo =s; 
	}
	//Métodos 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}
