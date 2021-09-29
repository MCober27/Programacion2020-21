package EjerciciosEstructuras1;

	/*
	 * 	10.-Obtener la suma de todos los números impares entre 3 y
	 *		21 exceptuando el 13 y el 17.
	 * 
	 */

public class EjercicioX {

	public static void main(String[] args) {
		
		int y = 0;
		
		for( int x = 3; x <= 21; x++) {		
			if( x % 2 != 0) {	
				if( x != 13 && x != 17) {
					y = y + x;
				}
			}	
		}
		System.out.println(y);
	}
}
