import java.util.Date;
import java.text.SimpleDateFormat;

public class PruebaIFDate {

	public static void main(String[] args) {
	// Ejercicio saludo con la hora del día
	//Con el uso de swith y de Date() determinar la hora del día
	// y asignarlo a una variable que se compare con el swith y
	// nos salude en base al valor de esta hora. 
	
		Date hora = new Date(); 
		SimpleDateFormat formatoHora= new SimpleDateFormat("HH");
		int HoraDia = Integer.parseInt(formatoHora.format(hora));
		
		String saludo;
		
	switch(HoraDia) {
			case 9: 
			saludo= "Buenos días"; 
			break; 
			case 10: 
			saludo ="Buenas tardes"; 
			break;
			default: 
			System.out.println("No has introducido la hora correcta");
		return;
	}
	System.out.println(saludo);
	}

}
