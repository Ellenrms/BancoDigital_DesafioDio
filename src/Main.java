
public class Main {

	public static void main(String[] args) {
		Cliente Mateus = new Cliente();
		Mateus.setNome("Mateus");
		
		Conta cc = new ContaCorrente(Mateus);
		Conta poupanca = new ContaPoupanca(Mateus);

		cc.depositar(100);
		cc.transferir(100, (IConta) poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}