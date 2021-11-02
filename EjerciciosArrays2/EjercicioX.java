package EjerciciosArrays2;

import java.util.Arrays;

/*
 *	10.-Dado el siguiente array de Strings [�Coche�, �Tren�, �Avi�n�, �Furgoneta�, �Moto�, �Barco�, �Autobus�] y este 
 *		otro array de booleanos [false, true, true, false, true, true, false]. El segundo array indica que elementos del 
 *		primero han de ser pasados a may�sculas (true) y cuales a min�sculas (false). Separar el resultado en dos arrays,
 *		uno donde est�n todos los correspondientes en may�sculas y otro con los otros en min�sculas.
 *
 * 		No debe de haber posiciones vacias.
 */

public class EjercicioX {

	public static void main(String[] args) {
		
		String[] trasportes = {"Coche", "Tren", "Avi�n", "Furgoneta", "Moto", "Barco", "Autobus"};
		boolean[] tipado = {false, true, true, false, true, true, false};
		
		int aux = 0;
		
		
		for( int i = 0; i<tipado.length; i++ ) {
			
			if( tipado[i] == true) {
				
				aux = aux + 1;
				
			}
			
		}
		
		String[] mayusculas = new String[aux];
		int auxMay = 0;
		String[] minusculas = new String[tipado.length-aux];
		int auxMin = 0;
		
		for( int j = 0; j<tipado.length; j++ ) {
			
			if( tipado[j] == true ) {
				
				mayusculas[auxMay] = trasportes[j].toUpperCase();
				auxMay = auxMay + 1;
				
			}else {
				
				minusculas[auxMin] = trasportes[j].toLowerCase();
				auxMin = auxMin +1;
				
			}
			
		}
		
		System.out.println( Arrays.toString(mayusculas) );
		System.out.println( Arrays.toString(minusculas) );
		

	}

}
