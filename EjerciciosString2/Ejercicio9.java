package EjerciciosString2;

	/*
	 *	9.-En un String con cualquier número de letras 'a' convertir una en mayúsculas
	 *	y la siguiente dejarla como está, la siguiente en mayúsculas y la siguiente dejarla...
	 *	etc...Probarlo con "Esta es una frase con algunas letras a".
	 */

public class Ejercicio9 {

	public static void main(String[] args) {
		
		String frase = "Esta es una frase con algunas letras a";
		String resultado = "";
		int aux = 0;
		
		for( int i = 0; i < frase.length(); i++ ) {
			
			if( frase.charAt(i) == 'A' || frase.charAt(i) == 'a' ) {
				
				aux++;
				
				if( aux % 2 != 0) {
					
					resultado = resultado + 'A';
					
				}else {
					
					resultado = resultado + frase.charAt(i);
					
				}
				
			}else {
				
				resultado = resultado + frase.charAt(i);
				
			}
			
		}
		
		System.out.println(resultado);
		
	}

}

