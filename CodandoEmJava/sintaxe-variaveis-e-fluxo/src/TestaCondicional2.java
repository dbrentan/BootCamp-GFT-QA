
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 16;
		int quantidadePessoa = 3;
		boolean acompanhado = quantidadePessoa >= 2;
		
		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade >= 18 || acompanhado) {
			System.out.println("seja Bem vindo");
		} else {
				System.out.println("Infelizmente voce não pode entrar");
		}

	}

}
