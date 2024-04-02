package UD9.Ejercicio5;

public class MainApp 
{

	public static void main(String[] args) 
	{
	
		//Se instancian profesor y alumnos
		Profesor profesor1 =new Profesor ("Javier",38, 'H',"matemáticas"); 
		Profesor profesor2 =new Profesor ("Jorge",38, 'H',"filosofía"); 
		Profesor profesor3 =new Profesor ("Pere",40, 'H',"matemáticas");
		
		Estudiantes estudiante1 = new Estudiantes("Sabrina", 15, 'M', 8.5); 
		Estudiantes estudiante2 = new Estudiantes("David", 13, 'H', 6.3);
		Estudiantes estudiante3 = new Estudiantes("Pedro", 16, 'H', 9); 
		Estudiantes estudiante4 = new Estudiantes("Alma", 14, 'M', 7.6); 
		Estudiantes estudiante5 = new Estudiantes("Yvette", 14, 'M', 5.8);
		Estudiantes estudiante6 = new Estudiantes("Raquel", 14, 'M', 8.8);
		Estudiantes estudiante7 = new Estudiantes("Pere", 17, 'H', 8); 
		
		
		//Se crea el aula 
		Aula aula1 =new Aula (1, 7,"matemáticas", profesor1);
		
		aula1.añadirProfesor(profesor1);
		
		//Añadimos estudiantes al aula 
		aula1.añadirEstudiantes(estudiante4);
		aula1.añadirEstudiantes(estudiante5);
		aula1.añadirEstudiantes(estudiante2);
		aula1.añadirEstudiantes(estudiante1);
		aula1.añadirEstudiantes(estudiante7);
		aula1.añadirEstudiantes(estudiante6);
		aula1.añadirEstudiantes(estudiante3);

		if (aula1.profesorDisponible()) 
		{
			System.out.println("Aula 1: Profesor disponible para dar clase");
			aula1.estudiantesAprobados();
		}else {
			System.out.println("Aula 1: No se puede dar clase");
		}
		
		//Creación nueva aula 2 
		Aula aula2 =new Aula (1, 8,"matemáticas", profesor3);
		
		aula2.añadirEstudiantes(estudiante4);
		aula2.añadirEstudiantes(estudiante5);
		aula2.añadirEstudiantes(estudiante2);
		aula2.añadirEstudiantes(estudiante1);
		aula2.añadirEstudiantes(estudiante7);
		aula2.añadirEstudiantes(estudiante6);
		//Se puede dar clase? 
		
		if (aula2.profesorDisponible()) 
		{
			System.out.println("Aula2: Profesor disponible para dar clase");
			aula2.estudiantesAprobados();
		}else {
			System.out.println("Aula 2: No se puede dar clase");
		}

		//Creación nueva aula3
		Aula aula3 =new Aula (1, 9,"filosofia", profesor2);
		
		aula3.añadirEstudiantes(estudiante4);
		aula3.añadirEstudiantes(estudiante5);
		aula3.añadirEstudiantes(estudiante2);
		aula3.añadirEstudiantes(estudiante1);
		aula3.añadirEstudiantes(estudiante7);
		aula3.añadirEstudiantes(estudiante6);
		//Se puede dar clase? 
		
		if (aula3.profesorDisponible()) 
		{
			System.out.println("Aula 3: Profesor disponible para dar clase");
			aula3.estudiantesAprobados();
		}else {
			System.out.println("Aula 3: No se puede dar clase");
		}
	}

}
