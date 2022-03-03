
public class TreinandoCodigos {
	
	public static void main(String[] args) {
		
		int[] celular = {34, 45, 65, 33, 66, 223};
		
		System.out.print("Ordem original: ");
		
		for(int i = 0 ; i < celular.length; i++) {
			
			System.out.print(celular[i] + " ");
		}
		
		
		System.out.print("\nOrdem inversa: ");
		
		
		for(int b = (celular.length -1); b >= 0; b--) {
		
		System.out.print(celular[b] + " ");
		
		}
		
	}
}