package EjerciciosEstructuras4;

	/*
	 *	2.- Obtener la suma de los números primos desde el que está en el lugar 8 hasta el lugar 14 (incluidos).
	 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int penultimo = 0, ultimo = 1, resultante = 0;
		int i = 0, suma = 0;
		
		do {

			resultante = ultimo + penultimo;
			penultimo = ultimo;
			ultimo = resultante;
		
			if(i >= 8 && i <= 14 ) {
				
				suma = suma + ultimo;
				System.out.println("Posicion: " + i + " | Numero: " + ultimo);
				
			}
		
			i++;
			
		} while( i <= 14 );
		
		System.out.println("--------------------------");
		System.out.println("La suma de los numeros Fibonacci desde la posicion 8 hasta la 14 da como resultado: "+suma);

	}

}
