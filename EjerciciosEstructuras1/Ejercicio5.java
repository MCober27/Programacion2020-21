package EjerciciosEstructuras1;

	/*
	 * 	4.- Obtener un listado de todos los numeros del 1 al 100 que contenga un 8
	 * 
	 */

public class Ejercicio5 {

	public static void main(String[] args) {
	
		int x = 1;
		
		do{	
			if( x % 10 == 8 ) {				
				System.out.println(x);	
			}		
			else if( (x % 80 >= 0) && (x % 80 < 10) && (x > 10) ) {
				System.out.println(x) ;
			}
		x++;
		}while( x <=100 );
	}
}
