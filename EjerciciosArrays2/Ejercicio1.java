package EjerciciosArrays2;

import java.util.Arrays;

/*
 *	1.-Reordenar de mayor a menor el siguiente array [4, 6, 1, 5, 6, 15, 12, 7].
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
	 int[] numeros = {4, 6, 1, 5, 6, 15, 12, 7};
	 int[]numerosOrdenados = new int[numeros.length]; 
	 int aux = numeros.length;
	 
	 Arrays.sort(numeros);
	 //System.out.println(Arrays.toString(numeros));
	 
	 for (int i = 0; i<numerosOrdenados.length; i++) {
		  
		 numerosOrdenados[i] = numeros[aux-1];
		 
		 aux--;
		 
	 }
	 
	 System.out.println(Arrays.toString(numerosOrdenados));
	 
	}

}