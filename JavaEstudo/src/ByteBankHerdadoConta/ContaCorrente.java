package ByteBankHerdadoConta;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}// sobreescrevendo o método saca
	@Override 
	public boolean saca(double valor) { // quando a conta for corrente cobre 0.2 centavos em cada saque
		
		double valorASacar = valor + 0.2;//criei a variavel que vai guardaro valor do desc no saque.
		return super.saca(valorASacar);
	}
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

}
