package EjerciciosString2;

	/*
	 *	2.-En cualquier frase sustituir todas las posiciones múltiplos de 3 por ‘#’.
	 *		Probarlo con “Esta es la frase donde vamos a poner almohadillas” 
	 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String frase = "Esta es la frase donde vamos a poner almohadillas";
		String respuesta = "";
		
		for( int i = 0; i < frase.length(); i++ ) {
			
			if( i % 3 == 0 ) {
				
				respuesta = respuesta + "#";
				
			}else {
				
				respuesta = respuesta + frase.charAt(i);
				
			}
			
		}
		
		System.out.println(respuesta);
		
	}

}
