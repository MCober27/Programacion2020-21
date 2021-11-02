package EjerciciosArrays2;

import java.util.Arrays;

	/*
	 *	5.- Coger la frase “Esta es la frase que vamos a partir” y obtener un array donde en cada posición esté una palabra de la frase. 
	 *	No utilizar el método split() de la clase String. 
	 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String frase = "Esta es la frase que vamos a partir";
		
		int aux = 0;
		int aux2 = 0;
		int pos_inicial = 0;
		int pos_final = 0;
		
		frase =  frase + " ";
	
		//Averiguamos cuantas palabras hay
		for( int i = 0; i<frase.length(); i++ ) {
			
			if( frase.charAt(i) == ' ' ) {
				
				aux = aux + 1;
				
			} 
			
		}
		
		//Creamos el array ahora que sabemos la longitud
		String[] palabras = new String[aux];
		
		//Metemos las palabras en el array
		
		for(int j = 0; j<frase.length(); j++ ) {
			
			if ( frase.charAt(j) == ' ') {
				
				pos_final = j;
				palabras[aux2] = frase.substring(pos_inicial, pos_final).trim();
				pos_inicial = pos_final;
				aux2 = aux2 + 1;
				
			}
			
		}
		
		System.out.println(Arrays.toString(palabras));
		
	}

}
