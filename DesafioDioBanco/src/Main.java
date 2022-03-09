
public class Main {
	
	public static void main(String[] args) {
		
		Cliente Daniel = new Cliente();
		Daniel.setNome("Daniel");
	
		Conta cc = new ContaCorrente(Daniel);
		Conta poupanca = new ContaPoupanca(Daniel);
		
		cc.depositar(500);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
