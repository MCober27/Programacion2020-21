package EjerciciosEstructuras2;

	/*
	 * 	2.- Crea una lista con todos los números pares entre -20 y 0
	 * 	seguida de todos los números impares entre 1 y 21.
	 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		for( int y = -20; y <= 21; y++) {
			
			if( (y >= -20) && (y <= 0) ) {
				if( y % 2 == 0) {
					System.out.println(y);
				}
			}
			else {
				if( y % 2 != 0) {
					System.out.println(y);
				}
			}			
		}
	}
}
