package EjerciciosString1;

	/*
	 *	1.- Obtener la suma de la longitud de estas tres palabras:
	 *		"locomotora", "camion", "coche".
	 * 
	 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String pal1 = "locomotora", pal2 = "camion", pal3 = "coche";
		int result = 0;
		
		result = pal1.length() + pal2.length() + pal3.length();
		
		System.out.println("La suma de las longitudes de las palabras: \r\r\t-" + pal1 + "\r\t-" +
						   pal2 + "\r\t-" + pal3 + "\r\rDa como resultado: " + result + " de longitud");
		
		
		
		
		

	}

}
