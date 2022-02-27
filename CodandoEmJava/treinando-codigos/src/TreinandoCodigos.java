
public class TreinandoCodigos {
	
	public static void main(String[] args) {
		
		System.out.println("estando escopo das variaveis");
		
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
			
		if (idade >= 18 || acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente voce não pode entrar");
		}
		
	}
}
