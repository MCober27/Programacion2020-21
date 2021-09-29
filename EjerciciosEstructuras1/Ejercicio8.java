package EjerciciosEstructuras1;

	/*
	 * 	8.- Obtener un listado de los números pares entre -20 y 0 y a
	 *		partir del 0 un listado de los números impares entre 1 y 21.
	 * 
	 */

public class Ejercicio8 {

	public static void main(String[] args) {
		
		for( int x = -20; x <= 21; x++ ) {
			if( (x >= -20) && (x <= 0) ) {
				if( x % 2 == 0) {System.out.println(x);}	
			}
			else {
				if( x % 2 != 0) {System.out.println(x);}		
			}
		}

	}

}
