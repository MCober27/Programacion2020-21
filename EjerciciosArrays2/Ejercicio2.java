package EjerciciosArrays2;

import java.util.Arrays;

/*
 *	2.- Dado el siguiente array de Strings [“tren”, “coche”, “barco”, “avioneta”] obtener otro de enteros y del mismo tamaño pero que en cada posición esté la longitud de cada
 *		String.
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		String[] palabras = {"tren", "coche", "barco", "avioneta"};
		int[] longitudes = new int[palabras.length];			
		int aux = 0;
		
		for( int i = 0; i<palabras.length; i++ ) {
			
			aux = palabras[i].length(); 
			
			longitudes[i] = aux;
			
		}
		
		//System.out.println(Arrays.toString(palabras));
		System.out.println(Arrays.toString(longitudes));

	}

}
