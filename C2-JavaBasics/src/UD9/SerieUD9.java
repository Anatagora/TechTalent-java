package UD9;

public class SerieUD9 implements Entregable
{

	private final int temporadas_default =3; 
	private boolean entrega_default= false; 
	
	protected String titulo; 
	protected int nTemporadas; 
	protected boolean entregado; 
	protected String genero; 
	protected String creador; 
	
	public SerieUD9() 
	{
		this.titulo ="##"; 
		this.nTemporadas = temporadas_default; 
		this.entregado = entrega_default; 
		this.genero ="##"; 
		this.creador ="##"; 
		
	}
	
	public SerieUD9(String titulo, String creador) 
	{
		this.titulo =titulo; 
		this.nTemporadas = temporadas_default; 
		this.entregado = entrega_default; 
		this.genero ="##"; 
		this.creador =creador; 
		
	}
	
	public SerieUD9(String titulo, int temporadas, String genero, String creador) 
	{
		this.titulo =titulo; 
		this.nTemporadas = temporadas; 
		this.entregado = entrega_default; 
		this.genero =genero; 
		this.creador =creador; 
		
	}
	
	public String toString() 
	{
        return "La serie: " + titulo 
        		+ "\n tiene " + nTemporadas +" temporadas,"
        		+ "\n es de genero " + genero 
        		+ "\n y su creador es  " +creador +".";
    }
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getnTemporadas() {
		return nTemporadas;
	}

	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
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
		if(a instanceof SerieUD9) {
			SerieUD9 otra_Serie= (SerieUD9) a; 
			return this.getnTemporadas() > otra_Serie.getnTemporadas();
		}else {
			if(a instanceof Videojuego) {
				Videojuego otroJuego= (Videojuego)a; 
				return false ; 
			}else {
				throw new IllegalArgumentException("No se puede comparar con un objeto de tipo desconocido");
			}
		}
		
	}
	
}
