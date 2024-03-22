package UD9;

public class LibroMain 
{

	public static void main(String[] args) 
	{
	
	Libro libro1 = new Libro (25898723, "El nombre del viento", "Patrick Rothfuss", 880);
	Libro libro2 = new Libro (97805787, " Dune ", "Frank Herbert", 632);

	System.out.println(libro1);
	System.out.println(libro2);
	
	  Libro libroConMasPaginas = Libro.compararPaginas(libro1, libro2);
      if (libroConMasPaginas != null) {
          System.out.println("\nEl libro con más páginas es: " + libroConMasPaginas.getTitulo());
      } else {
          System.out.println("Ambos libros tienen el mismo número de páginas.");
      }
	}

}
