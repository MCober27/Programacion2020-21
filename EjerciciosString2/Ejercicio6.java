package EjerciciosString2;

	/*
	 *	6.-	En cualquier frase sustituir las primeras tres letras ‘a’ por tres asteriscos.
	 *		Probarlo con la frase “Esta es la frase en la que vamos a probar”.
	 */

public class Ejercicio6 {

	public static void main(String[] args) {
	
		
		String frase = "Esta es la frase en la que vamos a probar";
		String resultado = "";
		int aux = 0;
		
		for( int i = 0; i < frase.length(); i++ ) {
			
			if( frase.charAt(i)=='a' || frase.charAt(i)=='A' ) {
				
				aux++;
				
				if( aux >= 1 && aux <= 3 ) {
					
					resultado = resultado + "*";
					
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
