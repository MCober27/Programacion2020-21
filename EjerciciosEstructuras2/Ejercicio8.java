package EjerciciosEstructuras2;

	/*
	 * 	8.- Mostrar la serie de Fibonacci entre 0 y 50. 
	 * 	Serie de Fibonacci: Consta de una serie de números naturales que se suman de a 2, a partir de 0 y 1. 
	 * Es decir, cada número es la suma de los dos anteriores.
	 * 
	 */

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int x = 0, y = 1, z = 0;
		System.out.println(z);
		while(x<34){
			z = x + y;
			y = x;
			x = z;
		
			System.out.println(x);
		}
			
		;
		

	}

}
