package EjerciciosString1;

	/*
	 *	7.- En cualquier frase obtener en que posici�n aparece por primera vez un espacio.
	 *		Y despu�s del primer espacio en que posici�n aparece el tercer espacio. Probarlo con 
	 *		�Esta es una frase con varios espacios�.
	 */

public class Ejercicio7 {

	public static void main(String[] args) {
		
		String frase = "Esta es una frase con varios espacios";
		int contador = 0;
		
		for( int i = 0; i < frase.length(); i++ ) {
			
			if( frase.charAt(i) == ' ') {
				
				contador++;
				
				if( contador == 1 || contador == 3 ) {
					
					System.out.println("El espacio encontrado en la " + contador + 
									   "� posicion est� en el posicion " + (i+1) );
					
				}
				
			}
		}
		
		
		
		
		
		

	}

}
