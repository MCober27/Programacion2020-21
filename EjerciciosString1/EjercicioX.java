package EjerciciosString1;

	/*
	 *	De cualquier palabra con un número par de letras, conseguir que la 
	 *	primera mitad este en mayúsculas y la segunda mitad en minúsculas. 
	 *	Probarlo con la palabra “LoCoMoToRa”.
	 */

public class EjercicioX {

	public static void main(String[] args) {

		String palabra = "locomotora";
		String trozo = "";
		String nuevapalabra = "";
		
		int longitud;
		
		
		if( palabra.length() % 2 == 0 ) {  
		
				longitud = palabra.length() / 2;
		
				//Primera mitad de la palabra en MAYUSCULAS.
				trozo = palabra.substring(0, longitud);		
				trozo = trozo.toUpperCase();
				nuevapalabra =  trozo;
		
		
				//Segunda mitad de la palabra en minusculas
				trozo = palabra.substring(longitud, palabra.length());
				trozo = trozo.toLowerCase();
				nuevapalabra = nuevapalabra + trozo;
		
				//Resultado a mostrar
				System.out.println(nuevapalabra);
		}else {
			
			System.out.println(	"La palabra para analizar no tiene una longitud de número par." + 
								"\rLa palabra '" + palabra + "' cuenta con una longitud de " + palabra.length() + " caracteres.");
			
		}		

	}

}
