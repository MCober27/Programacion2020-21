package EjerciciosEstructuras3;

/*
 *	9.- Obtener una lista de números entre el 0 y el 100. En cada cambio de decena se ha de imprimir el mensaje:
 *		‘Cambio de decena’.
 * 
 */

public class EjercicioX {

	public static void main(String[] args) {
		
		
		for( int i = 0; i<=100; i++ ) {
			
			if( i%10==0 && i!=100 && i!=0 ) {
				System.out.println("Cambio de decena: " + i);
			}else if( i == 100) {
				System.out.println("Cambio de centena: " + i);
			}else {
				System.out.println(i);
			}
				
		}
		
		

	}

}
