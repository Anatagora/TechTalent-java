
public class Extra2 {

	public static void main(String[] args) {
		int num=0;  
		while (num<=10)  {
		System.out.println("\n--Tabla del " + num + "--");
		int tabla=1; 
			while(tabla<=9) {
			int resultado = num *tabla; 
			
			System.out.println( +num+ "*" +tabla + "=" + resultado);
			tabla++;
			}
		
		num++;
		}
	}

}
