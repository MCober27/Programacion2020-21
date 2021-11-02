package EjerciciosArrays2;

import java.util.Arrays;

/*
 *	4.-	Dados estos dos arrays [2, 3, 4, 0, 2, 1, 4], [�hola�, �adi�s�, �que�, �veremos�, �suponiendo�, �puede�, �quiz�s�], obtener
 *		un tercer array donde est� el car�cter de cada String del segundo array que est� en la posici�n que indica el primer
 * 		array.
 *		Es decir, del String �hola� obtener el car�cter que est� en la posici�n 2, del String �adi�s� obtener el car�cter que est� en
 *		la posici�n 3, y as� sucesivamente.
 *		Si una posici�n es m�s larga que la posici�n del array tendr� que poner el car�cter �#�.
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int[] posiciones = {2, 3, 4, 0, 2, 1, 4};
		String[] palabras = {"hola", "adi�s", "que", "veremos", "suponiendo", "puede", "quiz�s"};
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
