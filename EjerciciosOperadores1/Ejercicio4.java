package ejercicios_operadores_1;

/*
 * 	4.- Crear dos variables con el valor 4 y 9. Obtener una variable
 *  	con la multiplicación de ambas. Restar después a
 *		esta última variable las dos primeras.
 * 
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Inicializamos 'result' pero podriamos no hacerlo
		int x = 4, y = 9, result = 0;
		
		// x * y = 36
		result = x * y;
		// 36 - 4 = 32
		result = result - x;
		// 32 -9 = 23
		result = result - y;
		
		System.out.println(result);
		
	}

}
