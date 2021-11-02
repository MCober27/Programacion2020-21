package EjerciciosString1;

public class Ejercicio9_charlie {

	public static void main(String[] args) {
		
		
		String frase = "Hola, me voy a tomar una olanzapina, por cierto, mira esa ola";
		String nuevaFrase1 = "";
		frase = " " + frase + " ";
		
				
		for( int i = 0; i < frase.length(); i++) {
			
			if( (frase.charAt(i) == 'o' || frase.charAt(i) == 'O') && 
				( frase.charAt(i-1) == ' ' || frase.charAt(i-1) == -1 || frase.charAt(i-1) == '¿' || frase.charAt(i-1) == '@' || frase.charAt(i-1) == '¡' || frase.charAt(i-1) == '-') ) {

				if( (frase.charAt(i+1)=='l' && frase.charAt(i+2)=='a') && 
					( frase.charAt(i+3)=='.' || frase.charAt(i+3)==',' || frase.charAt(i+3)==' ' || frase.charAt(i+3)=='?' || frase.charAt(i+3)=='!' || frase.charAt(i+3)== -1 ) ) {
					
	
					nuevaFrase1 = frase.substring(0, i);
					nuevaFrase1 = nuevaFrase1 + "nube" + frase.charAt(i+3) + frase.substring(i+4, frase.length());
					frase = nuevaFrase1;
					
				}
				
			}
			
		}
		System.out.println(nuevaFrase1);
		
	}
}
