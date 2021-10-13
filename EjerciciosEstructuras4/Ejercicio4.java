package EjerciciosEstructuras4;

	/*
	 *	4.- Obtener que factorial de que número es anterior a 4.000.000 (porque el factorial del sigueinte número ya es superior a 40.000.000)
	 */

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int resultado = 1, i = 1;
				
		while( resultado <= 4000000 ) {
				
			resultado = resultado * i;
			i++;
				
			
			//System.out.println("----------------");
			//System.out.println(i);
			//System.out.println(resultado);
			
			
		}

		System.out.print( (i-1) + "! = ");
		System.out.println( resultado / (i-1) );
		

		
		
		

	}

}
