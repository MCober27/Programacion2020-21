package EjerciciosEstructuras3;

	/*
	 *	3.- Hacer el siguiente listado: en primer lugar 2. En segundo
	 *		lugar el resultado de 2*2. En tercer lugar el resultado de
	 *		2*2*2 y así consecutivamente hasta que multipliquemos 2
	 *		por si mismo 10 veces.
	 * 
	 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int y = 1;
		
		for( int x = 1; x <= 10; x++ ) {
			
			int w = x;
		
			do {
				y = y * 2;	
				w--;
			}while(w>0);
			
			System.out.println(y);
			y = 1;	
		}
	}
}