package EjerciciosArrays2;

import java.util.Arrays;

/*
 *	3.-	Separar el siguiente array [2, 23, 12, 4, 36, 25, 11, 6, 21, 45, 18] en otros tres. El primero tiene que contener todos los
 *		elementos entre menores de 10, el segundo los elementos entre 11 y 20 y el tercero los elementos entre 21 y 30.
 *		Los elementos mayores de 30 serán descartados y los arrays no pueden tener posiciones vacias.
*/

public class Ejercicio3 {

	public static void main(String[] args) {
	
		int[] numeros = {2, 23, 12, 4, 36, 25, 11, 6, 21, 45, 18};

		int auxMenores = 0;
		int auxMedios = 0;
		int auxMayores = 0;
		
		Arrays.sort(numeros);
		
		for( int i = 0; i<numeros.length; i++ ) {
			
			if( numeros[i] < 10 ) {
				
				auxMenores++;
						
			}else if( numeros[i] >= 11 && numeros[i] <= 20 ){
				
				auxMedios++;
				
			}else if( numeros[i]>=21 && numeros[i] <=30 ){
				
				auxMayores++;
				
			}
				
		}
		
		int[] numerosMenores = new int[auxMenores];
		int[] numerosMedios = new int[auxMedios];
		int[] numerosMayores = new int[auxMayores];
		
		auxMenores = 0;
		auxMedios = 0;
		auxMayores = 0;
		
		for( int i = 0; i<numeros.length; i++ ) {
					
			if( numeros[i] < 10 ) {
				
				numerosMenores[auxMenores]=numeros[i];
				auxMenores++;
						
			}else if( numeros[i] >= 11 && numeros[i] <= 20 ){
				
				numerosMedios[auxMedios]=numeros[i];
				auxMedios++;
				
			}else if( numeros[i]>=21 && numeros[i] <=30 ){
				
				numerosMayores[auxMayores]=numeros[i];
				auxMayores++;
				
			}
						
		}
		
		System.out.println(Arrays.toString(numerosMenores));
		System.out.println(Arrays.toString(numerosMedios));
		System.out.println(Arrays.toString(numerosMayores));
		
	}

}
