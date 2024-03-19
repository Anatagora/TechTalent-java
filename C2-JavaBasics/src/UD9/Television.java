package UD9;

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
		
		public double precioFinal_Television() 
		{
			double precio =super.precioFinal((char)pulgadas, sintonizador); 
			if (pulgadas > 40) {
				precio= precio +50;
			}
			
			return precio; 
		}
		
		
		
		public void mostrar() 
		{
	        System.out.println("Lavadora tiene un precio de "+this.precioBase +
	        		" su color es "+this.color +
	        		" su consumo energetico es " + this.consumoEnergetico +
	        		" su peso es "+this.peso + " y tiene " +this.pulgadas +" pulgadas "+".");
	    }
	
}
