package EjerciciosString1;

	/*
	 *	5.- Coger cualquier frase y hacer un programa que muestre línea por línea
	 *		cada letra de la frase exceptuando los espacios. Probarlo con 
	 *		“Esta es la frase del ejercicio 4”.
	 *		O sea, el resultado debe de mostrar:
	 *
	 *		E
	 * 		s
	 * 	
	 * 		t
	 * 		a
	 * 		e
	 * 		s
	 * 		...
	 * 
	 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String frase = "Esta es la frase del ejercicio 4";
		
		for( int i = 0; i < frase.length(); i++ ) {
			
			if( frase.charAt(i) != ' ' ) {
				
				System.out.println(frase.charAt(i));
				
			}
			
		}
		

	}

}
