package EjerciciosArrays2;

import java.util.Arrays;

	/*
	 *	8.-	A partir del siguiente array de caracteres [‘a’, ‘b’, ‘f’, ‘g’, ‘e’, ‘i’, ‘o’, ‘p’, ‘x’], obtener un array 
	 *		de Strings donde los caracteres del array anterior estén agrupados de 3 en 3. Es decir, obtener el array [“abf”, “gei”, “opx”]
	 */

public class Ejercicio8 {

	public static void main(String[] args) {
		
		char[] letras = { 'a', 'b', 'f', 'g', 'e', 'i', 'o', 'p', 'x'};
		
		float aux;
		int aux2 = 0;		
		int aux3 = 0;
		
		//	Averiguamos la longitud del array porque si el array contuviera un numero de caracteres 
		//	NO multiplo de tres, sin esto, revienta el programa y no muestra los ultimos que no rellenen el conjunto de 3 caracteres.
		aux = letras.length;
		
		if(aux % 3 != 0) { 
			
			int resto = (int) aux % 3;
			System.out.println(resto);
		
			switch (resto) {
			
				case 1:
					
					aux = aux + 1;
					aux2 = (int) aux/3;
					aux2 = aux2 + 1;
					
					break;
				case 2:
					
					aux2 = (int) aux/3;
					aux2 = aux2 + 1;
					
					break;

			}
			
		}else {
			
			aux2 =  (int) aux/3;
			
		}
		
		
		//	Creamos el array con la longitud averiguada
		String[] resultados = new String[aux2];
		
		for( int i = 0; i<resultados.length; i++ ) {
						
			for( int j = i*3; j<letras.length; j++ ) {
				
				if(resultados[i] == null) {
					
					resultados[i] = "";
					resultados[i] = resultados[i] + letras[j];
					
					aux3 = 1;
					
				}else{
					
					if( aux3<3 ) {
						
						resultados[i] = resultados[i] + letras[j];
						aux3 = aux3 + 1;
				
					}
						
				}
				
			}
					
		}
		
		System.out.println(Arrays.toString(resultados));
	}

}
