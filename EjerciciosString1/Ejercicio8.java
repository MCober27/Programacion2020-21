package EjerciciosString1;

	/*
	*	8.- Hacer un programa que cuente el número de veces que aparece la letra 'e' (mayuscula o minuscula). Probar con la
	*	frase: "Este ejercicio es el primero de cuenta de letras".
	*/

public class Ejercicio8 {

	public static void main(String[] args) {
		
		String frase = "Este ejercicio es el primero de cuenta de letras";
		int contador = 0;
		
		for( int i = 0; i < frase.length(); i++ ) {
			
			if(frase.charAt(i)=='e' || frase.charAt(i)=='E') {
				contador++;
			}
			
		}
		
		System.out.println("En la frase:\r\r\t-" + frase + "\r\rEncontramos que hay " + contador + " 'e'.");
	
	}

}
