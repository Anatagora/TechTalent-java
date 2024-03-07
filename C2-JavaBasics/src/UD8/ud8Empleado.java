package UD8;

public class ud8Empleado {
	// Atributos 
	
	private String nombre; 
	private String apellido; 
	private int edad; 
	private double salario;
	
	// Métodos 
	
	public boolean plus (double sueldoPlus) {
		boolean aumento= false; 
		if(edad>40) {
			salario+=sueldoPlus;
				aumento= true; 
		}
		return aumento; 
	}
}
