package EjerciciosString2;

	/*
	 *	7.- Sustituir en cualquier frase “locomotora” por “tren” teniendo en cuenta que la palabra locomotora puede tener
	 *		alguna letra en mayúsculas. Probarlo con “La LOcomotora avanza con paso firme y no hay LOcomoTora que la iguale”.
	 */

public class Ejercicio7 {

	public static void main(String[] args) {
		
		String frase = "La LOcomotora avanza con paso firme y no hay LOcomoTora que la iguale";
		String[] palabras;
		String resultado = "";
		String aux;
		
		
		//Separamos la frase en palabras
		palabras = frase.split(" ");
		
		
		for(int i = 0; i < palabras.length; i++) {
			
			if(palabras[i].length() == 10) {
				
				aux = palabras[i].toLowerCase();
				
				if( aux.equals( "locomotora") ) {
					
					palabras[i] = "tren";
					resultado = resultado + palabras[i] + " "; 
					
				}else {
					
					resultado = resultado + palabras[i] + " ";
					
				}
				
			}else {
				
				resultado = resultado + palabras[i] + " ";
				
			}
				
		}
		
		System.out.println(resultado);
		
	}

}