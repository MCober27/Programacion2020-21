package EjerciciosOperadores2;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*	Tercer ejercicio:
		 *
		 *	Deducir utilizando la operacion módulo (%) si el número 10213 es multiplo de 4,
		 *	de 5, de 6, de, o de ninguno de ellos.Indicarlo en la respuesta.
		 *
		 */
		
		int x = 10213;
		
		for( int y = 4; y <= 7; y++) {
			
			if( x % y == 0 ) {
				System.out.println("--------------------------");
				System.out.println(x + " es multiplo de " + y);
				System.out.println("--------------------------");
			}
			else {System.out.println(x + " no es multiplo de " + y);
			}		
		}		
	}
}
