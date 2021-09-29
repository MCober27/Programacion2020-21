package EjerciciosEstructuras3;

	/*
	 *	1.- Crear una variable con el valor 34.5. Restar sucesivas veces el valor 0.3 a la
	 * 		anterior hasta que el valor de dicha sea menor que 22.4. Obtener el número de 
	 * 		veces que ha sido restado 0.3 hasta obtener el valor final
	 * 
	 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		double x = 34.5, y = 0.3;
		
		for( int i = 1; i<=100; i++ ) {
			
			x = x - y;
			
			if( x <= 22.4) {
				System.out.println("Se han realizado " + i + " iteraciones(vueltas) hasta alcanzar el primer resultado menor a 22,4:");
				System.out.println(x);
			break;
			}	
		}
	}
}
