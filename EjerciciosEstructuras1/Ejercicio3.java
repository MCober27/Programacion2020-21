package EjerciciosEstructuras1;

	/*
	 * 	3.- Obtener un listado de todos los números del -30 al 30.
	 * 		Los números que se encuentran entre 0 y 8 solo aparecerán
	 * 		los pares.
	 * 
	 */

public class Ejercicio3 {

	public static void main(String[] args) {
	
		for( int x = -30; x <= 30; x++) {
			
			if( (x>0) && (x<8) ) {
				
				if( x % 2 == 0) {
					System.out.println(x);
				}
			}else {
				System.out.println(x);
			}	
		}	
	}
}
