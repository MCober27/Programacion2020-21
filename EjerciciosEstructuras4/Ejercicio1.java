package EjerciciosEstructuras4;

	/*
	 *	1.- Obtener cual es el primer m�ltiplo de 37 por encima del n�mero 500.
	 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int x = 37, y = 500, z = 0;
		int i = 0;
		
		do {
			
			z = z + x;
			i++;

		} while( z <= 500 );
		
		System.out.println("El primer m�ltiplo de " + x + " que supera " + y + " es el n�mero " + z + " (" + x + " X " + i + ")");	

	}

}
