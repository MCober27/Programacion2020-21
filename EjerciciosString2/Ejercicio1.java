package EjerciciosString2;

	/*
	 *	1.- Partir una frase en dos. A continuación partir cada una de las dos mitades en otras dos.
	 *		Mostrar las cuatro partes. (Si en cualquier división el número es impar la segunda mitad
	 *		tendrá un carácter más). Probarlo con “Esta es la frase que vamos a partir en cuatro”
	 */

public class Ejercicio1 {

	
	public static void main(String[] args) {
		
		String frase = "Esta es la frase que vamos a partir en cuatro";
		String subfrase1 = "", subfrase2 = "", trozo1 = "", trozo2 = "", trozo3 = "", trozo4 = "";
		
		//Partimos la frase inicial en 2.
		subfrase1 = frase.substring( 0, (frase.length()/2) );
		subfrase2 = frase.substring( (frase.length()/2), frase.length() );
		//System.out.println( subfrase1 + " " + subfrase1.length() + " / " + subfrase2 + " " + subfrase2.length());
		//System.out.println("------------------------------------");
		
		//Partimos la primera mitad de la frase en dos: frase/2->subfrase1/2-> trozo1 y trozo2
		trozo1 = subfrase1.substring( 0, (subfrase1.length()/2) );
		trozo2 = subfrase1.substring( (subfrase1.length()/2), subfrase1.length() );
		//System.out.println( trozo1 + " " + trozo1.length() + " / " + trozo2 + " " + trozo2.length());
		//System.out.println("------------------------------------");
		
		//Partimos la primera mitad de la frase en dos: frase/2->subfrase1/2-> trozo1 y trozo2
		trozo3 = subfrase2.substring( 0, (subfrase2.length()/2) );
		trozo4 = subfrase2.substring( (subfrase2.length()/2), subfrase2.length() );
		//System.out.println( trozo3 + " " + trozo3.length() + " / " + trozo4 + " " + trozo4.length());
		
		//Mostramos el resultado obtenido
		System.out.println("Hemos obtenido el siguiente resultado partiendo de la frase: '" + frase + "'\r");
		System.out.println(trozo1);
		System.out.println(trozo2);
		System.out.println(trozo3);
		System.out.println(trozo4);
	}

}
