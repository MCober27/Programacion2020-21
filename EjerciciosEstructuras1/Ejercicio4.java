package EjerciciosEstructuras1;

	/*
	 * 	4.- Sin utilizar la sentencia FOR sacar un listado de todos
	 * 		los números impares de 7 al 21
	 * 
	 */

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int x = 7;
		
		while( x <= 21 ) {
			
			if( x % 2 ==1) {
				System.out.println(x);
			}
			x++;		
		}
	}
}
