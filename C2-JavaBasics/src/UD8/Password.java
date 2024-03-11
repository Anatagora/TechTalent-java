package UD8;

import java.util.Arrays;
import java.util.Random;

public class Password 
{

	int longitud[]= new int[8]; 
	int contraseña; 
	
	public Password() 
	{
		this.contraseña= 0; 
		this.longitud = new int[] {0,0,0,0,0,0,0,0};
		
	}
	
	public Password(int... longitud) 
	{
		 this.longitud = longitud;
		 this.contraseña= llenarArrayRandom(longitud);
		
	}
	
	public String toString() 
	{
		return Arrays.toString(longitud);
	}
	
	public static int llenarArrayRandom(int[]array) 
	{
		Random random= new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] =random.nextInt(10); 
		}
		return array[0];
	}
	
	public static void main(String[] args) 
	{
		Password ejemplo1 = new Password(1,3,3,4,5,6,7);
		Password ejemplo2 = new Password(1,3,3,4,5,6);
		
		System.out.println("Los valores de la contraseña Ejemplo 1 son "+ejemplo1 );
		System.out.println("Los valores de la contraseña Ejemplo 2 son "+ejemplo2 );
	}
}
