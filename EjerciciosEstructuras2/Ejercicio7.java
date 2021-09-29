package EjerciciosEstructuras2;

	/*
	 * 	7.- Obtener la suma de todos los numeros impares entre 0 y 100. Obtener
	 * 	la suma de todos los múltiplos  de 4 entre 0 y 50. Mostrar la resta de 
	 * 	las dos cantidades resultantes.
	 * 
	 */

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int x = 0, y = 0, z = 0;
		
		do {
			if(x <= 50) {
				
				if( x % 4 == 0) {
					y = y + x;
				}
				else if( x % 2 != 0) {
					z = z + x;
				}
			}
			else {
				if( x % 2 != 0) {
					z = z + x;
				}
			}
			x++;
		}while( x <= 100 );
		System.out.println("El sumatorio de todos los impares es: " + z);
		System.out.println("El sumatorio de todos los multiples de 4 hasta el 50 es: " + y);

		System.out.println("El resultado es " + (z - y));
	}

}
