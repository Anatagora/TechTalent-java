package UD9.ejercicio1;

public class Television extends ElectrodomesticoUD9 
{

	//Atributos 
		private final int pulgadas_default =5; 
		private final boolean sintonizador_default =false;
		
		private int pulgadas; 
		private boolean sintonizador; 
		
		//Constructores 
		public Television() 
		{
			super();
			this.pulgadas = pulgadas_default;
			this.sintonizador = sintonizador_default;
		}
		
		public Television(double precio, double peso) 
		{
			super(precio, "blanco", 'F', peso);
			this.pulgadas = pulgadas_default;
			this.sintonizador = sintonizador_default;
		}

		public Television(double precio, String color, char consumo, double peso ,int pulgadas, boolean tdt) 
		{	
			super(precio, color, consumo, peso);
			this.pulgadas = pulgadas;
			this.sintonizador = tdt;
		}
		
		public double precioFinal() 
		{
			double precio =super.precioFinal(consumoEnergetico, peso); 
			if (pulgadas > 40) {
				precio= (precio *0.3)+precio;
			}
			if (sintonizador == true) {
				precio= 50+precio;
			}
		
			return precio; 
		}
		
		
		public int getPulgadas() {
			return pulgadas;
		}

		public void setPulgadas(int pulgadas) {
			this.pulgadas = pulgadas;
		}

		public boolean isSintonizador() {
			return sintonizador;
		}

		public void setSintonizador(boolean sintonizador) {
			this.sintonizador = sintonizador;
		}

		public void mostrar() 
		{
	        System.out.println("Televisión tiene un precio de "+this.precioFinal() +
	        		" su color es "+this.color +
	        		" su consumo energetico es " + this.consumoEnergetico +
	        		" su peso es "+this.peso + " y tiene " +this.pulgadas +" pulgadas "+".");
	    }
	
}
