package UD7;

import java.util.Hashtable;
import java.util.Scanner;

public class T7Ejercicio01 {

	public static void main(String[] args) {
		
		 Hashtable<String, Double> notasAlumnos = calcularNotaMedia();
	        mostrarNotasMedias(notasAlumnos);
	    }

	    public static Hashtable<String, Double> calcularNotaMedia() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Ingrese la cantidad de alumnos en el curso de programación: ");
	        int numAlumnos = sc.nextInt();

	        Hashtable<String, Double> notasAlumnos = new Hashtable<>();

	        for (int i = 1; i <= numAlumnos; i++) {
	            System.out.print("Ingrese el nombre del alumno " + i + ": ");
	            String nombreAlumno = sc.next();

	            System.out.print("Ingrese la cantidad de notas para " + nombreAlumno + ": ");
	            int numNotas = sc.nextInt();

	            double sumaNotas = 0.0;

	            for (int j = 1; j <= numNotas; j++) {
	                System.out.print("Ingrese la nota " + j + " para " + nombreAlumno + ": ");
	                double nota = sc.nextDouble();
	                sumaNotas += nota;
	            }

	            double notaMedia = sumaNotas / numNotas;
	            notasAlumnos.put(nombreAlumno, notaMedia);
	        }
	        sc.close();
	        return notasAlumnos;
	    }

	    public static void mostrarNotasMedias(Hashtable<String, Double> notasAlumnos) {
	        System.out.println("\nNotas medias de los alumnos:");
	        for (String alumno : notasAlumnos.keySet()) {
	            double notaMedia = notasAlumnos.get(alumno);
	            System.out.println(alumno + ": " + notaMedia);
	        }
		
	}

}
