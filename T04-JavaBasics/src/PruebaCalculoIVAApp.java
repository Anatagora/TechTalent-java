
public class PruebaCalculoIVAApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int precioProducto=300; 
		final double IVA=0.21; 
		
		System.out.printf("Inforamción de producto\nEl precio del producto es " +precioProducto + "\nEl precio del producto incluyendo IVA es "+ (precioProducto+(precioProducto*IVA)));
	}

}
