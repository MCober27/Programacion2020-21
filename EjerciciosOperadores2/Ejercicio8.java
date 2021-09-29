package EjerciciosOperadores2;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*	Octavo ejercicio:
		 *
		 *	Obtener utilizando la operación módulo (%) cual es el siguiente número por
		 *	arriba del 712 que es multiplo de 11.
		 *	
		 */
		
		int x = 712, y, z = 11;
		
		y = x % 11;
		
			
		z = z - y;
			
		x = x + z;
		y = x % 11;
		System.out.println("El siguiente numero a 712 que es multiplo de 11 es " + x);

	}

}
