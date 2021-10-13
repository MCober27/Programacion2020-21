package EjerciciosEstructuras5;

	/*
	 *	1.- La serie de Fibonacci en un momento dado acaba con el número 196418 seguido del 317811. Partiendo
	 *		de estos dos números obtener los 10 números anteriores de la serie.
	 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int ultimo = 317811, penultimo = 196418, antepenultimo = 0;
		
		System.out.println(ultimo);
		System.out.println("---------");
		System.out.println(penultimo);
		System.out.println("---------");
		
		for( int i = 0; i < 10; i++ ) {
			
			antepenultimo = ultimo - penultimo;
			
			ultimo = penultimo;
			penultimo = antepenultimo;
			

			
			System.out.println(penultimo);
			System.out.println("---------");
			
		}
		

		
		
		
		
		
		
	}

}
