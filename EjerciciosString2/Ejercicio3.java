package EjerciciosString2;

	/*
	 *	3.- Obtener en que posición esta la cuarta ‘a’ en una frase. Si la frase 
	 *		tiene menos de 4 aes tiene que indicarlo. “Probarlo con “Esta es una frase con unas cuantas aes”
	 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String frase = "Esta es una frase con unas cuantas aes";
		int contador = 0;
		
		for( int i = 0; i < frase.length(); i++ ) {
			
			if( frase.charAt(i) == 'A' || frase.charAt(i) == 'a' ) {
				
				contador++;
				
				if( contador == 4) {
					
					System.out.println("La cuarta " + frase.charAt(i) + " se encuntra en la posicion " + i );
					
				}
				
			}	
			
		}
		
		if( contador < 4) {
			
			System.out.println("La frase dada: \r\t-" + frase + "\rNo llega a 4 'aes'");
			
		}
		

	}

}
