package EjerciciosOperadores2;

public class Primos {
	
	public static void main(String[] args) {
		
		
		System.out.println(1);
		for( int x = 2; x <= 1000; x++) {		
			
			for( int y = x, z = 0 ; y >= 1; y-- ) {
					
				if( (x % y == 0) && (y != 1) && (x == y) ) {					
					z = 1 ;
				}else if( (x % y == 0) && (y != 1) && (x != y) ) {
					z = 0;
				}
				else if(y == 1) {
					
					switch(z) {
					
					case 1:
						System.out.println(x);
						break;
					case 2:
						System.out.println("--");
						break;
					default:
						break;
					}
					
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
		}
		
		
		
		
	}

}
