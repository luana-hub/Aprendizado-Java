package ByteBank;

public class Conta {

	double saldo;
	int agencia;
	int numero;
	String titular;
	
	private double valor;

	public boolean deposita(double valor) {
		this.saldo += valor;
		if (this.saldo >= valor)

		{
			this.saldo -= valor;
			return true;
		} else {
			return false;

		}

	}
}
