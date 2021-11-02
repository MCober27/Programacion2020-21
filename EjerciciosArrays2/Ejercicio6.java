package EjerciciosArrays2;

import java.util.Arrays;

	/*
	 *	6.- Repetir el ejercicio anterior utilizando el método split(cadena) de la clase String, donde cadena es el String por donde vamos a romper la frase. 
	 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		String frase = "Esta es la frase que vamos a partir";
		
		String[] palabras = frase.split(" ");
		
		System.out.println( Arrays.toString(palabras) );
	}

}
