package EjerciciosArrays2;

import java.util.Arrays;

/*
 *	4.-	Dados estos dos arrays [2, 3, 4, 0, 2, 1, 4], [“hola”, “adiós”, “que”, “veremos”, “suponiendo”, “puede”, “quizás”], obtener
 *		un tercer array donde esté el carácter de cada String del segundo array que está en la posición que indica el primer
 * 		array.
 *		Es decir, del String “hola” obtener el carácter que está en la posición 2, del String “adiós” obtener el carácter que está en
 *		la posición 3, y así sucesivamente.
 *		Si una posición es más larga que la posición del array tendrá que poner el carácter ‘#’.
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int[] posiciones = {2, 3, 4, 0, 2, 1, 4};
		String[] palabras = {"hola", "adiós", "que", "veremos", "suponiendo", "puede", "quizás"};
		char[] letras = new char[palabras.length];
		
		
		for( int i = 0; i<palabras.length; i++ ) {
			
			if( posiciones[i] > palabras[i].length() ) {
				
				letras[i] = '#';
				
			}else {
				
				letras[i] = palabras[i].charAt(posiciones[i]);
				
			}	
				
		}
		
		System.out.println(Arrays.toString(letras));

	}

}
