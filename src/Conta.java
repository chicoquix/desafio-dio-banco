
public class Conta implements IConta{
	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	

	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		
	}
	
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirAtributo() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("conta: %d", this.numero));
		System.out.println(String.format("Saldo : %.2f", this.saldo));
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}


}
