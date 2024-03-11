package UD8;

import java.util.Random;

public class Password2 
{

	private final int DEFAULT_LENGHT = 8;
	
	private int lenght;
	private String password;

	public Password2()
	{
		this.lenght = DEFAULT_LENGHT;
		this.password = GeneratePassword(DEFAULT_LENGHT);
	}
	
	public Password2(int passwordLenght)
	{
		this.lenght = passwordLenght;
		this.password = GeneratePassword(passwordLenght);
	}

	public String ToString() 
	{
		return this.password;
	}
	
	private String GeneratePassword(int passwordLenght) {
		Random randomGenerator = new Random();
		StringBuilder password = new StringBuilder();
		
		for(int i=0; i<passwordLenght; i++) {
			password.append(randomGenerator.nextInt(0,9));
		}
	
		return password.toString();
	}
	
	public static void main(String[] args) 
	{
		Password2 passwordTest1 = new Password2(5);
		Password2 passwordTest2 = new Password2();

		System.out.println("Your password 1 is: " + passwordTest1.ToString());
		System.out.println("Your password 2 is: " + passwordTest2.ToString());
	}
}
