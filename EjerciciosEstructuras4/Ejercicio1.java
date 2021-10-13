package EjerciciosEstructuras4;

	/*
	 *	1.- Obtener cual es el primer múltiplo de 37 por encima del número 500.
	 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int x = 37, y = 500, z = 0;
		int i = 0;
		
		do {
			
			z = z + x;
			i++;

		} while( z <= 500 );
		
		System.out.println("El primer múltiplo de " + x + " que supera " + y + " es el número " + z + " (" + x + " X " + i + ")");	

	}

}
