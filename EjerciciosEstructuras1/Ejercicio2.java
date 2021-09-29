package EjerciciosEstructuras1;

	/*
	 * 	2.- Obtener un listado de todos los números del 1 al 10
	 * 	En la posición del cinco en lugar de salir el número ha de salir
	 * 	la palabra 'CINCO'.
	 * 
	 */

public class Ejercicio2 {

	public static void main(String[] args) {
			
		for( int x = 1; x <= 10; x++ ) {	
			
			if( x == 5) {
				System.out.println("CINCO");
			}
			else {
				System.out.println(x);
			}

		}

	}

}
