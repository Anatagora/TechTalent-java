package UD10;

public class Ejercicio02_Exception 
{
	public static void main(String[] args) {
        try {
            // Abrimos un bloque try
            System.out.println("Comenzando el bloque try...");

            // Creamos un objeto de nuestra excepción personalizada y la lanzamos
            // el try and catch, es como un switch, entra en un caso y gracias al break va directo al final.
            throw new MiExcepcion("¡Esto es una excepción personalizada!");
            
        } catch (MiExcepcion e) {
            // Capturamos y manejamos la excepción personalizada
            System.out.println("¡Excepción capturada!");
            System.out.println("Mensaje de la excepción: " + e.getMessage());
        } finally {
        	System.out.println("Programa finalizado!");
        }
    } 
}

class MiExcepcion extends Exception {
    // Constructor que acepta un mensaje de error
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}

///* 
//
//*En Java, todas las excepciones deben ser subclases de la clase base Throwable, ya sea directa o indirectamente.
//*La clase Throwable tiene dos subclases principales: Exception y Error.
//Como esperamos que sea una excepción que el programa pueda tratar, extendemos Exception.
//Generamos el constructor con un string para poder introducir más tarde el mensaje que queremos.
//Con throw new instaciamos la expeción de tpo CustomException y la capturamos y nombramos en catch.
//En catch expresamos las instrucciones necesarias para que podamos tratar esa CustomException.
//finally se ejecuta independientemente de que se haya generado y tratado una CustomException o no.
//*/
