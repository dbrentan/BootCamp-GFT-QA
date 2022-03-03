import java.util.Scanner;

public class ExercicioTabuada {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero desejado: ");
		int tabuada = scan.nextInt();
		
		System.out.println("Bora fazer a tabuada do " + tabuada);
		
		for(int i = 1; i <= 10; i++) {
					
			System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
		
			
		}
		
	}

}
