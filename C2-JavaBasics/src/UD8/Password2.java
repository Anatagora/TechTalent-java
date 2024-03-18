package UD8;

import java.util.Random;

public class Password2 
{

	private final int DEFAULT_LENGHT = 8;
	
	private int longitud;
	private String pass;

	public Password2()
	{
		this.longitud = DEFAULT_LENGHT;
		this.pass = GeneratePassword(DEFAULT_LENGHT);
	}
	
	public Password2(int passwordLenght)
	{
		this.longitud = passwordLenght;
		this.pass = GeneratePassword(passwordLenght);
	}

	public String toString() 
	{
		return this.pass;
	}
	
	private String GeneratePassword(int passLongitud) 
	{
		Random randomGenerator = new Random();
		StringBuilder password = new StringBuilder();
		
		for(int i=0; i<passLongitud; i++) {
			password.append(randomGenerator.nextInt(0,9));
		}
	
		return password.toString();
	}
	
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
