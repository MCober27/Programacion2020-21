package EjerciciosString2;

	/*
	 *	8.- Convertir cualquier palabra con un número impar de caracteres y de más de dos
	 *		caracteres, en que sea todo con minúsculas, excepto el carácter justo del medio
	 *		que será con mayúsculas. Probarlo con “TERREMOTO”. 
	 */

public class Ejercicio8 {

	public static void main(String[] args) {
		
		String palabra = "TERREMOTO";
		String resultado = "";
		int longitud;
		int medio;
		
		
		//Primero comprobamos la longitud de la palabra
		longitud = palabra.length();
		//Recogemos la posicion del caracter del medio de la palabra
		medio = palabra.length()/2;
		
		//Si la palabra tiene una longitud impar
		if( longitud % 2 != 0 && longitud > 2 ) {
			//Ponemos toda la palabra a minusculas
			palabra = palabra.toLowerCase();
			//Recorremos cada una de las posciones de la palabra
			for(int i = 0; i < palabra.length(); i++) {
				
				//Cuando llega al caracter del medio
				if( i == medio ) {
					//Recogemos el caracter
					char letraEspecial = palabra.charAt(i);
					//COn la ayuda de una variable auxiliar lo convertimos a String
					String aux = Character.toString(letraEspecial);
					//El String SI puede usarse toUpperCAse()
					aux = aux.toUpperCase();
					//Reconvertimos el stering del caracter en mayusculas a un char
					letraEspecial = aux.charAt(0);
					
					//Lo añadimos al resultado
					resultado = resultado +  letraEspecial;
					
				}else {
					//Si no es la posicion de en medio que simplemente la añada al resultado
					resultado = resultado + palabra.charAt(i);
					
				}
				
			}
			
			System.out.println(resultado);
			
		}else {
			
			System.out.println("La palabra " + palabra + " no tiene una longitud impar como se requiere");
			
		}
		
	}

}
