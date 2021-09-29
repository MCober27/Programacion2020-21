package EjerciciosOperadores2;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*	Septimo ejercicio:
		 *
		 *	Crear una variable con el valor 31. Restarle 1 tres veces. A continuación
		 *	restarle 4 dos veces. Finalmente dividirla por 7.
		 *	
		 */
		
		double x = 31;
		
		for( int y = 0; y < 3; y++) {
			x = x - 1;
		}
		for( int z = 0; z < 2; z++) {
			x = x - 4;
		}
		x = x / 7;
		
		System.out.println(x);

	}
}
