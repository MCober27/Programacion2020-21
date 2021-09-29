package EjerciciosEstructuras2;

/*
 * 	9.- Mostrar la suma de todos los números impares entre -30 y 35.
 * 
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int z = 0;
		
		for( int y = -30; y <= 35; y++ ) {
			
			if( y % 2 != 0) {
				z = z + y;
			}	
		}
		System.out.println(z);

	}

}
