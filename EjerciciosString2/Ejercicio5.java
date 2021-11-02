package EjerciciosString2;

	/*
	 *	5.- Obtener el número de palabras que hay en cualquier frase. Probarlo con “A ver cuantas palabras hay aquí.”
	 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String frase = "A ver cuantas palabras hay aquí.";
		String[] palabras;
		
		palabras = frase.split(" ");
		
		System.out.println("En la frase dada hay " + palabras.length + " palabras");
		

	}

}
