package EjerciciosEstructuras2;

	/*
	 * 	1.- Obtener un listado con todos los múltiplos de 5 entre 5 y 50
	 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		for( int y = 5; y <= 50; y++) {			
			if( y % 5 == 0) {
				System.out.println(y);
			}
		}
	}
}
