package EjerciciosEstructuras2;

	/*
	 * 	5.- Sin utilizar FOR obtener un listado de todos los numeros
	 * 	entre 0 y 50 que contengan el 2 o el 3.
	 * 
	 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int x = 0;
		
		do {		
			if( (x<20) && ((x % 10 ==2) || (x % 10 ==3)) ){
				System.out.println(x);
			}
			else if( (x >= 20) && (x<= 39) ) {
				System.out.println(x);
			}
			else if( (x % 10 == 2) || (x % 10 == 3) ) {
				System.out.println(x);
			}
			x++;
		}while(x<=50);

	}

}
