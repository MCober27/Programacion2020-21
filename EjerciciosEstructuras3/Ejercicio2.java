package EjerciciosEstructuras3;

	/*
	 *	2.- Crear la variable booleana meta = false. Sumar todos los números consecutivamente
	 *		1 + 2 + 3 + 4 + etc. Cuando la suma anterior sea mayor de 40 obtener cual ha sido
	 *		el último número sumado y cambiar meta a true.
	 * 
	 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		boolean meta = false;
		int z = 0;
		
		for( int i = 1; i<=50; i++) {
			z = z + i;			
			if( z >= 40 ) {			
				meta = true;
			}
			if( meta == true ) {
				System.out.println(z);
				System.out.println(i-1);
				//En la iteracion 8 el resultado es 36¿ Se refiere a mostrar esta iteracion?
				break;
			}
			
		}

	}

}
