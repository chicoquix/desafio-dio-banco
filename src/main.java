
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Conta conta = new ContaCorrente();
			conta.depositar(100);
			Conta poupanca = new ContaPoupanca();
			conta.transferir(45, poupanca);
			
			conta.imprimirExtrato();
			poupanca.imprimirExtrato();
	}

}
 