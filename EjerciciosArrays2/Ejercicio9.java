package EjerciciosArrays2;

import java.util.Arrays;

	/*
	 *	9.- Coger la siguiente frase  “Esta es la frase del ejercicio nueve” y obtener dos arrays de caracteres, 
	 *		uno donde estén todas las consonantes y otro donde estén todas las vocales.
	 */

public class Ejercicio9 {

	public static void main(String[] args) {
		
		String frase = "Esta es la frase del ejercicio nueve";
		int vocal = 0;
		
		for( int i = 0; i<frase.length(); i++ ) {
			
			if( frase.charAt(i) == 'A' || frase.charAt(i) == 'a' ||
				frase.charAt(i) == 'E' || frase.charAt(i) == 'e' ||
				frase.charAt(i) == 'I' || frase.charAt(i) == 'i' ||
				frase.charAt(i) == 'O' || frase.charAt(i) == 'o' ||
				frase.charAt(i) == 'U' || frase.charAt(i) == 'u' ) {
				
				vocal = vocal + 1;	
				
			}
			
		}
		
		//System.out.println(vocales);
		char[] vocales = new char[vocal];
		int auxVocales = 0;
		char[] consonantes = new char[frase.length() - vocal];
		int auxConsonantes = 0;
		
		for( int j = 0; j<frase.length(); j++ ) {
			
			if( frase.charAt(j) == 'A' || frase.charAt(j) == 'a' ||
				frase.charAt(j) == 'E' || frase.charAt(j) == 'e' ||
				frase.charAt(j) == 'I' || frase.charAt(j) == 'i' ||
				frase.charAt(j) == 'O' || frase.charAt(j) == 'o' ||
				frase.charAt(j) == 'U' || frase.charAt(j) == 'u') {
				
				vocales[auxVocales] = frase.charAt(j);
				auxVocales = auxVocales + 1;
					
			}else {
				
				consonantes[auxConsonantes] = frase.charAt(j);
				auxConsonantes = auxConsonantes + 1;
				
			}
			
		}
		
		System.out.println(Arrays.toString(vocales));
		System.out.println(Arrays.toString(consonantes));

	}

}
