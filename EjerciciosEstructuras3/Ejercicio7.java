package EjerciciosEstructuras3;

	/*
	 *	7.- Obtener el resultado de dividir 4096 entre 2, a continuaci�n entre 3, a continuaci�n entre 4 y as�
	 *		consecutivamente hasta 8. Hacerlo empleando la sentencia FOR o WHILE.
	 * 
	 */

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int x = 4096, resultado = 0;
		
		for( int i = 2; i<=8; i++ ) {
			
			resultado = x / i;
			System.out.println("Al dividir " + x + " entre "+ i + " da como resultado " + resultado);
		}	
	}
}
