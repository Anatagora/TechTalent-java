package Tasca2;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lower, upper, step; 
		double fahr, celsius; 
		lower = 0;
		upper = 300;
		step = 20;
		fahr = lower;
		while(fahr<= upper) {
			celsius = (5.0/9.0)*(fahr-32.0);
			System.out.println(fahr + " " + celsius);
			fahr = fahr + step;
		}
	}

}
