package UD5;

public class MetodosString {

	public static void main(String[] args) {
	
	String str= "Hola Mundo";
	
	// Métodos para Strings 
	char ch= str.charAt(0); // ch contendrá "H"
	int index= str.indexOf("Mundo"); // Te devuelve el indice 5 // si no encuentra el valor te devuelve "-1"
	boolean endsWith= str.endsWith("Mundo"); // true 
	boolean startsWith= str.startsWith("Hola"); //true 
	int length= str.length(); //10 
	String subStr = str.substring(5); // "Mundo" Coge todo a partir del valor que se le indica, ese incluido
	String subStrI = str.substring(0,4); // "Hola" No coge el 4, porque es (4-1) Pero si que coge el 0, el inicial
	
	String upperCaseStr=str.toUpperCase(); // "HOLA MUNDO" 
	String lowerCaseStr=str.toLowerCase(); // "hola mundo" 
	
	String replaceStr= str.replace('0', 'x'); // "Hxla Mundx" Reemplaza valores de tipo caracter
	
	//Ejercicio calculo del último caracter del String
	char ultimoChar= str.charAt(str.length()-1); 
	
	
	//Muestro resultados 
	System.out.println("El valor del indice 0 es " +ch 
			+ "\nEl último 'valor' acaba en \"Mundo\"?"
			+endsWith ); 
	
	System.out.println("El último caracter es: " +ultimoChar); 
	
	}

}
