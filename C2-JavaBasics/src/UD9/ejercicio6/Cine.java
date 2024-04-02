package UD9.ejercicio6;

public class Cine 
{

	private Pelicula pelicula;
	private double precio;
	private int filas;
	private int columnas;

	public Cine() {
		this.pelicula = new Pelicula();
		this.precio = 10;
		this.filas = 8;
		this.columnas = 8;
	}

	public Cine(Pelicula pelicula, double precio, int filas, int columnas) {
		this.pelicula = pelicula;
		this.precio = precio;
		this.filas = filas;
		this.columnas = columnas;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	@Override
	public String toString() {
		return "Cine [pelicula=" + pelicula + ", precio=" + precio + ", filas=" + filas + ", columnas=" + columnas
				+ "]";
	}
}
