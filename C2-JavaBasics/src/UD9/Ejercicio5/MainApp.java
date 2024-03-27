package UD9.Ejercicio5;

public class MainApp 
{

	public static void main(String[] args) 
	{
	
		//Se instancian profesor y alumnos
		Profesor profesor1 =new Profesor ("Javier",38, 'H',"matemáticas"); 
		Estudiantes estudiante1 = new Estudiantes("Sabrina", 15, 'M', 8.5); 
		Estudiantes estudiante2 = new Estudiantes("David", 13, 'H', 6.3);
		Estudiantes estudiante3 = new Estudiantes("Pedro", 16, 'H', 9); 
		Estudiantes estudiante4 = new Estudiantes("Alma", 14, 'M', 7.6); 
		Estudiantes estudiante5 = new Estudiantes("Yvette", 14, 'M', 5.8);
		
		//Se crea el aula 
		Aula aula1 =new Aula (1, 5,"matemáticas", profesor1);
		
		//Añadimos estudiantes al aula 
		aula1.añadirEstudiantes(estudiante4);
		aula1.añadirEstudiantes(estudiante5);
		aula1.añadirEstudiantes(estudiante2);
		aula1.añadirEstudiantes(estudiante1);
		
		//Se puede dar clase? 
		
		if (aula1.profesorDisponible()) 
		{
			System.out.println("Profesor disponible para dar clase");
			aula1.estudiantesAprobados();
		}else {
			System.out.println("No se puede dar clase");
		}

	}

}
