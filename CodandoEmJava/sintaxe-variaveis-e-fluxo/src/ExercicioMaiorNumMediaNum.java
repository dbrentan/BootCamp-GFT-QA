import java.util.Scanner;

public class ExercicioMaiorNumMediaNum {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int media = 0;
		int count = 0;
		
		do {
		
		System.out.println("Número: ");
		numero = scan.nextInt();
		
		media = media + numero;
		
		
		
		if(numero > maior) {
			maior = numero;
		}
		
		count++;
		
		}while (count < 5);
		
		System.out.println("O maior numero é: " + maior);
		System.out.println("Soma: " + (media/5));
	}

}
