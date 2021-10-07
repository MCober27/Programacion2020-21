package EjerciciosEstructuras3;

	/*
	 *	6.- Obtener la suma de todos los números impares desde -21 a -9 más la suma de todos los elementos pares de 14 a 64.
	 * 
	 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int impares = 0, pares = 0, total = 0;
		
		for( int i = -21; i<=64; i++) {
			
			if( i>=-21 && i<=-9 ) {
				
				if( i%2!=0 ) impares = impares + i;
						
			}
			else if( i>=14 && i<=64 ) {
				
				if( i%2==0 ) pares = pares + i;
				
			} 
			
		}
		
		total = impares + pares;
		System.out.println("La suma de todos los numeros impares entre -21 y -9 da como resultado: " + impares);
		System.out.println("La suma de todos los numeros pares entre 14 y 64 da como resultado: " + pares);
		System.out.println("La suma entre estos conjuntos da como resultado: "+ total);

	}

}
