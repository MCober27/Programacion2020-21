package EjerciciosString1;

	/*
	 *	2.- Obtener que tres caracteres hay en las posiciones 0, 13 y 18 de una frase. Probarlo
	 *		con "En un lugar de la Mancha".
	 * 
	 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String frase = "En un lugar de la Mancha";
		
		for( int i = 0; i < frase.length(); i++) {
			
			if (i == 0 || i == 13 || i == 18) {
				System.out.println("En la posicion " + i + " hay una '" +frase.charAt(i) + "'");
			}
			
		}
		
	}

}
