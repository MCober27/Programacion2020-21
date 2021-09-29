package EjerciciosEstructuras2;

	/*
	 * 	6.- Mostrar la frase: "Listado entre 1 y 10" y a continuación mostrar
	 * 	este listado. A continuación mostrar la frase "listado entre 30 y 40
	 * 	y a continuación mostrar el listado
	 * 
	 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		System.out.println("Listado entre 1 y 10");
		for( int y = 1; y <= 40; y++) {
			if( (y>0) && (y<11)) {
				System.out.println(y);
			}
			else if( (y >= 11) && (y<29) ) {
				//NADA
			}
			else if( (y == 29)) {
				System.out.println("Listado entre 30 y 40");
			}
			else {
				System.out.println(y);
			}
		}
	}
}
