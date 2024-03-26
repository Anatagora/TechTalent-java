package UD9;

public class Videojuego implements Entregable
{

	private boolean entrega_default= false;
	
	protected String titulo;
	protected int horas_estimadas; 
	protected boolean entregado =entrega_default;
	protected String genero; 
	protected String compañia; 
	
	public Videojuego() 
	{
		this.titulo ="##"; 
		this.horas_estimadas= 0; 
		this.entregado =entrega_default; 
		this.genero ="##"; 
		this.compañia ="##"; 
	}
	
	public Videojuego(String nombre, int horas) 
	{
		this.titulo =nombre; 
		this.horas_estimadas= horas; 
		this.entregado =entrega_default; 
		this.genero ="##"; 
		this.compañia ="##"; 
	}
	
	public Videojuego(String nombre, int horas, String tipo, String productora) 
	{
		this.titulo =nombre; 
		this.horas_estimadas= horas; 
		this.entregado =entrega_default; 
		this.genero =tipo; 
		this.compañia =productora; 
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHoras_estimadas() {
		return horas_estimadas;
	}

	public void setHoras_estimadas(int horas_estimadas) {
		this.horas_estimadas = horas_estimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	public String toString() 
	{
        return "El videojuego: " + titulo 
        		+ "\n tiene una estimación de horas de " + horas_estimadas 
        		+ "\n es de genero " + genero 
        		+ "\n y la compañia que lo ha desarollado es " +compañia +".";
    }

	//Métodos interfaz Entregable
	@Override
	public boolean entregar() {
		entregado=true;
		return entregado;
	}

	@Override
	public boolean devolver() {
		entregado=false;
		return entregado;
	}

	@Override
	public boolean isEntregado() {
		return entregado;
	}

	@Override
	public boolean compareTo(Object a) 
	{
		if (a instanceof Videojuego) {
			Videojuego otro_videojuego=(Videojuego)a; 
			return this.getHoras_estimadas() > otro_videojuego.getHoras_estimadas();
		}else { 
			if(a instanceof SerieUD9) {
				SerieUD9 otra_serie = (SerieUD9) a; 
				return false; 
			}else {
				throw new IllegalArgumentException("No se puede comparar con un objeto de tipo desconocido");
			}
		}
	}
}
