
public class CalculoFatorial {
	
	public static void main(String[] args) {
		
		int total = 1;
		int fatorial = 1;
		
		for (int n = 1; n <= 10; n++) {
			
			total = total * fatorial; 
			
			System.out.println("O fatorial de " + fatorial + " é: " + total);
			
			fatorial++;
		}
		
	
		
	}

}
