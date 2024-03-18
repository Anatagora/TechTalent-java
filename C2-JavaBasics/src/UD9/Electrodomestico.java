package UD9;

public class Electrodomestico 
{

	protected final double precio_default = 100.0; 
	protected final String color_default= "Blanco";
	protected final char consumo_default = 'F'; 
	protected final double peso_default = 5; 
	
	
	private double precioBase; 
	private String color; 
	private char consumoEnergetico; 
	private double peso; 
	
	public Electrodomestico() 
	{
		this.precioBase = precio_default; 
		this.color = color_default; 
		this.consumoEnergetico = consumo_default; 
		this.peso= peso_default; 
	}
	
	public Electrodomestico(double precio, double peso) 
	{
		this.precioBase = precio; 
		this.color = color_default; 
		this.consumoEnergetico = consumo_default; 
		this.peso= peso; 
	}
	
	public Electrodomestico(double precio, String color, char consumo, double peso) 
	{
		this.precioBase = precio; 
		this.color = color; 
		this.consumoEnergetico = consumo; 
		this.peso= peso; 
	}
	
	public void mostrar() 
	{
        System.out.println("El electrodoméstico tiene un precio base de "+this.precioBase +
        		" su color es "+this.color +
        		" su consumo energetico es " + this.consumoEnergetico +
        		" y su peso es "+this.peso +".");
    }

	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
