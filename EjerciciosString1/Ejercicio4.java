package EjerciciosString1;

	/*
	 *	4.- Crear una cadena con el nombre a y el valor “mesa”. Crear el carácter (char) 
	 *		con el nombre b y el valor ‘s’. Comprobar que si hacemos a = a+b, obtenemos 
	 *		la cadena a = “mesas”. Es decir, que podemos concatenar una cadena con un char.
	 * 
	 */

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String a = "mesa";
		char b = 's';
		
		a = a+b;
		
		System.out.println(a);

	}

}
