package UD9.Ejercicio3;

public class Libro 
{

	//Atributos
	protected int ISBN;
	protected String titulo; 
	protected String autor; 
	protected int numero_paginas; 
	
	//Constructores
	public Libro() 
	{
		this.ISBN =0; 
		this.titulo= "##"; 
		this.autor ="##"; 
		this.numero_paginas= 0; 
	}
	public Libro(int codigo,String titul,String nombre, int paginas ) 
	{
		this.ISBN =codigo; 
		this.titulo= titul; 
		this.autor =nombre; 
		this.numero_paginas= paginas; 
	}
	
	//Métodos 
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumero_paginas() {
		return numero_paginas;
	}
	public void setNumero_paginas(int numero_paginas) {
		this.numero_paginas = numero_paginas;
	}
	
	public String toString() 
	{
        return "El libro: " + titulo 
        		+ " con ISBN: " + ISBN
        		+ " creado por el autor: " + autor 
        		+ " tiene " +numero_paginas +" páginas";
    }
	
	 public static Libro compararPaginas(Libro libro1, Libro libro2) 
	 {
	        if (libro1.getNumero_paginas() > libro2.getNumero_paginas()) {
	            return libro1;
	        } else if (libro1.getNumero_paginas() < libro2.getNumero_paginas()) {
	            return libro2;
	        } else {
	            return null; // Ambos libros tienen el mismo número de páginas
	        }
	 }
}
