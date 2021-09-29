package EjerciciosEstructuras1;

	/*
	 * 	1.- Obtener un listado de todos los números pares del 2 al 20.
	 * 
	 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		for( int x = 1; x <= 20; x++) {
			
			if( x % 2 ==0) {
				System.out.println(x);
			}
			
		}
	}
}
