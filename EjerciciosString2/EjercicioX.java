package EjerciciosString2;

	/*
	 * 10.- En cualquier frase obtener todas las palabras que contengan alguna ‘e’. Probarlo con la frase “En esta frase hay
	 *		palabras que tienen la letra a y otras que no”.
	 * 
	 */

public class EjercicioX {

	public static void main(String[] args) {
		
		String frase = "En esta frase hay palabras que tienen la letra a y otras que no";
		char letraN = 'e';
		String mayuscula;
		char letraM;
		String correctas = "";
		String[] palabras;
		String[] correctasE;
		
		//Conversor de minuscula a mayuscula
		mayuscula = Character.toString(letraN);
		mayuscula = mayuscula.toUpperCase();
		letraM = mayuscula.charAt(0);
		
		//Divisor de palabras
		palabras = frase.split(" ");
		
		for( int i = 0; i < palabras.length; i++) {
			
			if( palabras[i].indexOf(letraN) != -1 ||  palabras[i].indexOf(letraM) != -1) {
				
				correctas = correctas + " " + palabras[i];
				
			}
			
		}
		correctasE = correctas.trim().split(" ");
		
		//Mostrar resultado 
		System.out.println("Las palabras que contienen la letra " + letraN + "/" + letraM + " son:");
		for( int j = 0; j < correctasE.length; j++) {
			System.out.println("- "+correctasE[j]);
		}
	
	}

}
