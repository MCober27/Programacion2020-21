package EjerciciosEstructuras4;

	/*
	 *	3.- Obtener cual es el número de la serie de Fibonacci más cercano (por arriba o por abajo) al numero 700
	 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int penultimo = 0, ultimo = 1, resultante = 0;
		boolean b = true;
		int resta = 0, restaAnterior = 700;
			
		do {

			resultante = ultimo + penultimo;
			penultimo = ultimo;
			ultimo = resultante;
			
			resta = 700 - ultimo;
			System.out.println(ultimo);
			
					
			if( resta == 0 || (restaAnterior > resta  && resta >= 0) ) {
				
				restaAnterior = resta;
				
			}else {
				
				b = false;
	
			}
			
		} while( b == true );
		
		System.out.println("El numero de la serie Fibonacci mas cercano a 700 por abajo es " + penultimo);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("El numero de la serie Fibonacci mas cercano a 700 por arriba es " + ultimo);
		

	}

}
