package ejercicios_operadores_1;

/*
 * 	2.- Crear tres variables con los valores 10, 19'5 y 30'5. Obtener
 * 		una cuarta variable con la suma.
 * 
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int x = 10;
		double y = 19.5 , z = 30.5 , w;
		
		w = x + y + z;
		System.out.println("El valor de la suma de " + x + ", " + y + " y " + z + " es:");
		System.out.println(w);
		
	}

}
