package UD9.ejercicio1;

public class ElectrodomesticoUD9 
{

	protected final double precio_default = 100.0; 
	protected final String color_default= "Blanco";
	protected final char consumo_default = 'F'; 
	protected final double peso_default = 5; 
	
	
	protected double precioBase; 
	protected String color; 
	protected char consumoEnergetico; 
	protected double peso; 
	
	public ElectrodomesticoUD9() 
	{
		this.precioBase = precio_default; 
		this.color = color_default; 
		this.consumoEnergetico = consumo_default; 
		this.peso= peso_default; 
	}
	
	public ElectrodomesticoUD9(double precio, double peso) 
	{
		this.precioBase = precioFinal( consumoEnergetico, peso); 
		this.color = color_default; 
		this.consumoEnergetico = consumo_default; 
		this.peso= peso; 
	}
	
	public ElectrodomesticoUD9(double precio, String color, char consumo, double peso) 
	{
		this.precioBase = precioFinal( consumo, peso); 
		this.color = comprobarColor(color); 
		this.consumoEnergetico = comprobarConsumoEnergetico(consumo); 
		this.peso= peso; 
	}
	
	public void mostrar() 
	{
        System.out.println("El electrodoméstico tiene un precio de "+this.precioFinal(consumoEnergetico, peso) +
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
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	protected char comprobarConsumoEnergetico(char letra) 
	{
        char[] letrasValidas = {'A', 'B', 'C', 'D', 'E', 'F'};
        boolean letraValida = false;

        for (char letraValidaAux : letrasValidas) {
            if (letra == letraValidaAux) {
                letraValida = true;
                break;
            }
        }

        if (!letraValida) {
            letra = consumo_default;
        }

        return letra;
    }
	
	protected String comprobarColor (String color) 
	{
		String[] colores = {"Blanco", "Rojo","Negro", "Azul", "Gris"};
        
        for (String color_Aux : colores) {
            if (color.equals(color_Aux)) { 
                return color;
            }
        }

        return color_default;
	}
	
	protected double precioFinal(char consumoEnergetico, double peso) 
	{
		double precio=precioBase;
		switch (consumoEnergetico) 
		{
		case 'A': 
			precio+=100; 
			break; 
		case 'B': 
			precio+=80;
			break;
		case 'C': 
			precio+=60;
			break;
		case 'D': 
			precio+=50;
			break;
		case 'E': 
			precio+=30;
			break;
		case 'F': 
			precio+=10;
			break;
		}
		
		
		if (peso <= 19) {
			precio += 10; 
		} else if (peso <= 49){
			precio += 50;
		}else if (peso <= 79){
			precio += 80;
		} else {
			precio += 100;
		}
//		double precioFinal= precio + precio2+precioBase; 
//		System.out.println(precio);
		return precio; 
		
	}
}
