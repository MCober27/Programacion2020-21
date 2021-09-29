package ejercicios_operadores_1;

/*
 *	6.- Crear una variable con el valor 4. Obtener el módulo 2, 3
 *		y 4 de esta variable. (La operación módulo es %)..
 * 
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int x = 4, mod;
		
		mod = 4 % 2;
		System.out.println("El modulo 2 de " + x + " es " + mod);
		mod = 4 % 3;
		System.out.println("El modulo 3 de " + x + " es " + mod);
		mod = 4 % 4;
		System.out.println("El modulo 4 de " + x + " es " + mod);
		//Tambien podria operarse dentro del propio system.out.println
		//System.out.println("El modulo 3 de " + x + " es " + (4%4));
	}

}
