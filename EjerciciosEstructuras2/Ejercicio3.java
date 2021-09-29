package EjerciciosEstructuras2;

	/*
	 * 	3.- Obtener un listado de 1 a 20. En cada número múltiplo 
	 * 	de 3 además del número pondrá el texto: 'Múltiplo de tres'
	 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		for(int y = 1, x = 0; y <= 20; y++) {
			
			x = y % 3;
			
			switch(x) {
			case 0: 
				System.out.print("Es multiplo de tres: ");
			default:
				System.out.println(y);
			}		
		}
	}
}
