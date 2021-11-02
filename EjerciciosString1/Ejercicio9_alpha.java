package EjerciciosString1;

	/*
	*	9.- Hacer un programa que sustituya en cualquier frase la palabra ola por nube. 
	*		Probarlo con “Hola, me voy a tomar una olanzapina, por cierto, mira esa ola”.
	*		(No sustituir el ola de la palabra Hola, ni de olanzapina).
	*/

public class Ejercicio9_alpha {

	public static void main(String[] args) {
		
		String frase = "Hola, me voy a tomar una olazapina, por cierto, mira esa ola";
		String sub = "nube";
		String nuevaFrase = "";
		
		String[] palabras = frase.split(" ");
		
		for( int i = 0; i < palabras.length; i++) {
			
			String acortada = palabras[i].trim();
			
			if( acortada.equals("ola") || acortada.equals("ola.") || acortada.equals("ola,") || acortada.equals("ola?") || acortada.equals("ola!")) {
				
				palabras[i] = "nube";
				
			}
			
			nuevaFrase = nuevaFrase + palabras[i] + " ";
					
		}
		
		System.out.println(nuevaFrase);
		
		
		
		

	}

}
