package EjerciciosString2;

	/*
	 *	En cualquier frase cambiar la primera y la última palabra a mayúsculas. Probarlos 
	 *	con la frase “Esta es la frase donde vamos a hacer los cambios”
	 */

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String frase = "Esta es la frase donde vamos a hacer los cambios";
		String[] palabras;
		String resultado = "";
		
		palabras = frase.split(" ");
		
		for( int i = 0; i<palabras.length; i++) {
			
			if( i == 0 || i == (palabras.length-1) ) {
				
				resultado = resultado + palabras[i].toUpperCase() + " ";
				
			}else {
				//El toLowerCAse() es solo para cercionarnos de que cualquier palabra que
				//no sea la primera o ultima este en minusculas
				resultado = resultado + palabras[i].toLowerCase() + " ";
				
			}
			
		}
		
		System.out.println(resultado.trim());

	}

}
