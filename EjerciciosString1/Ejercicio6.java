package EjerciciosString1;

	/*
	 *	6.- Crear cuatro Strings con los valores “uno” ,“dos”, “tres” y “cuatro”. 
	 *		A partir de estos Strings obtener un quinto que contenga lo siguiente 
	 *		“uno, dos, tres y cuatro”.
	 * 
	 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		String a = "uno", b = "dos", c = "tres", d = "cuatro";
		String e = "";
		
		e = a + ", " + b + ", " + c + " y " + d;
		
		System.out.println(e);
		
		
		

	}

}
