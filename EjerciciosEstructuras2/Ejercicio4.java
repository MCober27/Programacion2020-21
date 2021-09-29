package EjerciciosEstructuras2;

	/*
	 * 	4.- Obtener la suma de todos los números múltiplos de 3 entre
	 * 	3 y 99.
	 */

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int x = 3, y= 0;

		do {
			if( x % 3 == 0) {
				y = y + x;
			}
			x++;
		}while(x<=99);
		System.out.println(y);
	}
}
