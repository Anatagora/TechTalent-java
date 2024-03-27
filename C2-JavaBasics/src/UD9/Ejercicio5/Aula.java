package UD9.Ejercicio5;

public class Aula 
{
	//Atributos 
	private int nAula; 
	private int max_Capacidad; 
	private String materia; 
	private Profesor profesor; 
	private Estudiantes[] estudiantes; 
	private int nEstudiantes; 
	
	//Constructores 
	public Aula(int num, int capacidad, String asignatura, Profesor profesor) 
	{
		this.nAula =num; 
		this.max_Capacidad =capacidad; 
		this.materia= asignatura; 
		this.profesor =profesor; 
		this.estudiantes = new Estudiantes[max_Capacidad]; 
		this.nEstudiantes =0; 	
	}
	
	
	public boolean profesorDisponible() //Verifica si el profesor puede dar clase
	{
		if(!profesor.polimorfismo()) 
		{//Disponibilidad
			return false;
		}
		if(!profesor.getMateria().equalsIgnoreCase(materia)) 
		{ //Asignatura correcta
			return false; 
		}
		
		int asistentes=0; 
		for (Estudiantes estudiante2 : estudiantes) 
		{//Verifica 50% estudiantes en clase
			if(estudiante2 != null && !estudiante2.polimorfismo()) 
			{
				asistentes++;
			}
		}
		return asistentes >(max_Capacidad/2);
	}
	
	public void añadirEstudiantes(Estudiantes estudiante) 
	{
		if(nEstudiantes<max_Capacidad) {
			estudiantes[nEstudiantes++]=estudiante; 
		}else {
			System.out.println("Aula llena");
		}
	}
	
	//Contar estudiantes aprobados 
	public void estudiantesAprobados() 
	{
		int alumnos_Aprobados =0; 
		int alumnas_Aprobadas =0; 
		
		for (Estudiantes estudiantes2 : estudiantes) {
			if(estudiantes2 != null && estudiantes2.getCalificacion_actual()>=5)
			{
				if(estudiantes2.getSexo() == 'H') { 
					alumnos_Aprobados++; 
				}else if (estudiantes2.getSexo()=='M') {
					alumnas_Aprobadas++; 
				}
			}
		}
		System.out.println("----- ESTUDIANTES APROBADOS ------");
		System.out.println("Alumnos hombres aprobados: " +alumnos_Aprobados);
		System.out.println("Alumnas mujeres aprobadas: " +alumnas_Aprobadas);
	}
}
