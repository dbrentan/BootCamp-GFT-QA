import java.util.Scanner;

public class ExercicioFatorial {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um valo r: ");
		int fatorial = scan.nextInt();
		
		int multiplicacao = 1;
		
		System.out.print(fatorial + "! = ");
		
		for(int i = fatorial; i >=1; i--) {
			
			multiplicacao = multiplicacao * i;
			
		}
		System.out.println(multiplicacao);
	}

}
