package UD9.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class SerieVideojuegoMainApp 
{
	public static void main(String[] args) 
	{
	SerieUD9 ArrayS[]= new SerieUD9 [5];
	Videojuego ArrayV[]= new Videojuego [5];
	
	//Creación de Objetos Serie y Videojuegos
	Videojuego Videojuego1 = new Videojuego("To the moon", 6,"RPG","Freebird Games");
	Videojuego Videojuego2 = new Videojuego("Animal Crossing: New Horizons", 630,"Simulación de vida","Nintendo Co., Ltd");
	Videojuego Videojuego3 = new Videojuego("The Legend of Zelda: Breath of the Wild", 100,"RPG","Nintendo Co., Ltd");
	Videojuego Videojuego4 = new Videojuego("Tunic", 17,"Acción isométrico","Isometricorp Games & Finji");
	Videojuego Videojuego5 = new Videojuego("RollerCoaster Tycoon", 65,"Estrategia empresarial, construcción y gestión","Hasbro Interactive y Atari");
	
	SerieUD9 Serie1 = new SerieUD9("Peaky Blinders", 6,"Drama /Crimen","Steven Knight");
	SerieUD9 Serie2 = new SerieUD9("One Piece", 20,"Aventura","Eiichirō Oda");
	SerieUD9 Serie3 = new SerieUD9("Mindhunter", 2,"Drama","Joe Penhall");
	SerieUD9 Serie4 = new SerieUD9("Crims", 5,"Documental","Carles Porta");
	SerieUD9 Serie5 = new SerieUD9("Better Call Saul", 6,"Drama","Vince Gilligan");
	
	//Insercción de cada objeto en su Array
		ArrayS[0] = Serie1; 
		ArrayS[1] = Serie2; 
		ArrayS[2] = Serie3;
		ArrayS[3] = Serie4;
		ArrayS[4] = Serie5;
		
		ArrayV[0] = Videojuego1;
		ArrayV[1] = Videojuego2;
		ArrayV[2] = Videojuego3;
		ArrayV[3] = Videojuego4;
		ArrayV[4] = Videojuego5;
		
	// Uso del método entregar
		Serie1.entregar(); 
		Serie3.entregar(); 
		Serie4.entregar(); 
		Videojuego2.entregar(); 
		Videojuego4.entregar(); 
		Videojuego5.entregar(); 
		
		ArrayList<Entregable>entregados= contador(ArrayS, ArrayV);
		System.out.println("Hay un total de "+entregados.size()+ " series y videojuegos entregados.");
		
		SerieUD9 seriePlus =ObtenerSerieConMasTemporadas(ArrayS);
		System.out.println("\nLa serie que más temporadas tiene es\n "+seriePlus +".");
		
		Videojuego videojuegoPlus =ObtenerVideojuegoMasHoras(ArrayV);
		System.out.println("\nEl videojuego con más horas es \n "+videojuegoPlus +".");
		
		
	}
	public static ArrayList<Entregable> contador(SerieUD9 ArrayS[], Videojuego ArrayV[]) 
	{
		List<Entregable> listaEntregados= new ArrayList<>();
		
		for (Videojuego videojuego : ArrayV) {
			if (videojuego.isEntregado())
			{
				listaEntregados.add(videojuego);
			}
		}
		for (SerieUD9 serie : ArrayS) {
			if (serie.isEntregado()) {
				listaEntregados.add(serie);
			}
		}
		return (ArrayList<Entregable>) listaEntregados;
	}
	
	public static SerieUD9 ObtenerSerieConMasTemporadas(SerieUD9 ArrayS[]) 
	{
		SerieUD9 serie_con_mas_temporadas=ArrayS[0];
		for (SerieUD9 serie : ArrayS) {
			if (serie.compareTo(serie_con_mas_temporadas)) {
				serie_con_mas_temporadas = serie;
			}
		}
		return serie_con_mas_temporadas;
		
	}
	
	public static Videojuego ObtenerVideojuegoMasHoras(Videojuego ArrayV[]) 
	{
		Videojuego juego_con_mas_horas=ArrayV[0];
		for (Videojuego videojuego : ArrayV) {
			if (videojuego.compareTo(juego_con_mas_horas)) {
				juego_con_mas_horas = videojuego;
			}
		}
		return juego_con_mas_horas;
		
	}
}
