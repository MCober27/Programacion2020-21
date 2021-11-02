package EjerciciosString1;

	/*
	 *	3.- Obtener la subcadena de la posicion 4 a la 8 en una frase. Probarlo
	 *		con "Ahora estamos en este ejercicio".
	 * 
	 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String frase = "Ahora estamos en este ejercicio";
		String subfrase = "";
		
		subfrase = frase.substring(4,9);
		System.out.println(subfrase);
		

	}

}
