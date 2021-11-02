package EjerciciosArrays2;

import java.util.Arrays;

	/*
	 *	7.- Coger el siguiente array [6, 9, 8, 10, 11] y dividirlo por este otro, posición a posición, 
	 *		[2, 3, 4, 2, 3] y en el resultado sumarle 10 a todos los valores menores de 4.
	 */

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int[] numeros = {6, 9, 8, 10, 11};
		float[] divisores = {2, 3, 4, 2, 3};
		float[] resultados = new float[numeros.length];
		
		for( int i = 0; i<numeros.length; i++ ) {
			
			resultados[i] = numeros[i] / divisores[i]; 
			
			if( resultados[i] < 4 ) {
				
				resultados[i] = resultados[i] + 10;
				
			}
			
		}
		
		System.out.println( Arrays.toString(resultados) );
		
	}

}
