package EjerciciosEstructuras;

	/*
	 * 	4.- Obtener un listado de todos los números múltiplos de 4 entre 4 y 40
	 * 
	 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int x = 4;
		
		while( x <= 40 ) {		
			if( x % 4 == 0) {
				System.out.println(x);
			}
			x++;
		}
	}
}
