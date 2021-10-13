package EjerciciosEstructuras4;

	/*
	 *	5.- Hacer un listado ordenado de todos los numeros que tengan el 3, el 6 y el 9 desde el 0 hasta el 499.
	 *		Todos los números deberán tener 3 cifras, es decir el 9 se mostrará como 009, o el 31 como 031...
	 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
		
		for( int i = 0; i < 500; i++ ) {
			//Del 0 al 10
			if( (i > 0 && i < 10) && ( i%3==0 || i%6==0 || i%9==0 ) ) {
				
				System.out.println("00"+i);
				
			}
			//Del 10 al 99
			else if(  ( ( i>10 && i<100 ) && ( i%10==3 || i%10==6 || i%10==9 ) ) || 
				   ( i>=30 && i<=39 ) || ( i>=60 && i<=69 ) || ( i>=90 && i<=99 ) ) {
				
				System.out.println("0"+i);
				
			}
			//Del 100 al 299 y del 400 al 499
			else if( ( ( i>=100 && i<=299 ) && ( i%10==3 || i%10==6 || i%10==9 ) ) ||                                                                     
				   ( ( i>=130 && i<=139 ) || ( i>=160 && i<=169 ) || ( i>=190 && i<=199 ) ) ||
				   ( ( i>=230 && i<=239 ) || ( i>=260 && i<=269 ) || ( i>=290 && i<=299 ) ) ||
				   ( ( i>=400 && i<=499 ) && ( i%10==3 || i%10==6 || i%10==9 ) ) ) {
				
				System.out.println(i);
				
			}
			//Del 300 al 399
			else if( i>=300 && i<=399 ) {
				
				System.out.println(i);
				
			}

		}
		
	}

}
