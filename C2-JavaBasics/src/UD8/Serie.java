package UD8;

public class Serie 
{

	private final int temporadas_default =3; 
	private boolean entrega_default= false; 
	
	private String titulo; 
	private int nTemporadas; 
	private boolean entregado; 
	private String genero; 
	private String creador; 
	
	public Serie() 
	{
		this.titulo ="##"; 
		this.nTemporadas = temporadas_default; 
		this.entregado = entrega_default; 
		this.genero ="##"; 
		this.creador ="##"; 
		
	}
	
	public Serie(String titulo, String creador) 
	{
		this.titulo =titulo; 
		this.nTemporadas = temporadas_default; 
		this.entregado = entrega_default; 
		this.genero ="##"; 
		this.creador =creador; 
		
	}
	
	public Serie(String titulo, int temporadas, String genero, String creador) 
	{
		this.titulo =titulo; 
		this.nTemporadas = temporadas; 
		this.entregado = entrega_default; 
		this.genero =genero; 
		this.creador =creador; 
		
	}
	
	public void mostrar() 
	{
        System.out.println( "La serie se titula " +this.titulo + 
        		" tiene "+this.nTemporadas +" temporadas, "+
        		"su genero es " + this.genero + 
        		" y su creador es "+this.creador +".");
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

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
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

	public static void main(String[] args) 
	{
		Serie serie1 = new Serie (); 
		serie1.mostrar(); 
		
		Serie serie2 = new Serie ("Las locas aventuras de M.Rajoy", "M.Rajoy"); 
		serie2.mostrar();
		
		Serie serie3 = new Serie("Oh no! Elecciones otra vez", 2, "Comedia politica", "Pere Aragonès"); 
		serie3.mostrar();
		
		Serie serie4 = new Serie("The Office", 9, "Comedia", "Ricky Gervais"); 
		serie4.mostrar(); 
	}
}
