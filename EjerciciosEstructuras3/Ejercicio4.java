package EjerciciosEstructuras3;

	/*
	 *	4.- Utilizando la estructura DO-WHILE obtener un listado de los n�meros pares del 22 al 48
	 * 
	 */

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int x = 22;
		
		do{
			System.out.println(x);
			x = x + 2;
		}while( x<=48 );
	}
}