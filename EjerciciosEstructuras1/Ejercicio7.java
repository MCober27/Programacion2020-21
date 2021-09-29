package EjerciciosEstructuras1;

	/*
	 * 	7.- Sin utilizar la sentencia FOR haced una lista de 10 a -10 seguido a continuacion
	 * 		de otra lista -10 a 10
	 * 		
	 * 
	 */

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int x = 10, y;
		
		while( x >= -10 ) {
			System.out.println(x);
			
			if(	x == -10 ) {
				
				y = x;
				while( y <= 10) {
					
					System.out.println(y);
					y++;
				}
			}
			x--;
		}
	}

}
