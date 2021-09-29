package ejercicios_operadores_1;

/*
 *	10.- Partiendo del número 1000 dividirlo por 2.3, luego
 *		 dividirlo por 8, a continuación dividirlo por 5.7 y finalmente
 *		 obtener el cubo de este número final.
 * 
 */

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int x = 1000, z = 8;
		double y = 2.3, w = 5.7, k;
		
		k = x / y;
		//System.out.println(k);
		k = k / z;
		//System.out.println(k);
		k = k / w;
		//System.out.println(k);
		k = k * k * k;
		System.out.println(k);
	}

}
