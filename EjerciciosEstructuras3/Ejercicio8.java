package EjerciciosEstructuras3;

	/*
	 *	8.- Obtener la suma de todos los números entre 0 y 100 exceptuando aquellos que contengan un 7.
	 * 
	 */

public class Ejercicio8 {

	public static void main(String[] args) {
	
		int x = 0, all = 0, resultado = 0;
		
		for( int i = 1; i<=100; i++) {
			
			all = all + i;
			
			if( i==7 || i%10==7 || (i>=70 && i<=79) ) {
				
				x = x + i;
				
			}
			
		}
		//System.out.println(x);
		//System.out.println(all);
		//System.out.println(all-x);
		System.out.println("La suma de todos los numeros del 1 al 100 sin contar con aquellos que posean un 7 da: " + (all-x) );

	}

}
