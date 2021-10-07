package EjerciciosEstructuras3;

	/*
	 *	5.- Obtener cuantas veces hay que sumar 0,48 (0,48+0,48+0,48+...etc) para sobrepasar el valor 23,4.
	 * 
	 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
		double x = 0.48, y = 0;
		int i = 0;
		
		while(y <= 23.4) {
			
			y = y + x;
			i++;
		}
		System.out.println("Son necesarias sumar consecutivamente "+ i + 
							" veces el numero " + x + " para sobrepasar el valor 23.4 (alcanza el valor " + y + ")");
		

	}

}
