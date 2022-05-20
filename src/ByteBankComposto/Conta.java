package ByteBankComposto;

public class Conta {
	private double saldo;
	double sacar;
	int agencia;
	int numero;
	Cliente titular;

	private double valor;

	public void deposita(double valor) {
		this.saldo += valor;

	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;

		}

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
		}
		return false;

	}
//NÃO PRECISO DO setSaldo  PORQUE QUERO QUE A MODIFICAÇÃO DO MESMO ACONTEA ATRAVES DE TRANFERÊNCIA E DEPÓSITOS
	public double getSaldo() {
		return this.saldo;

	}

}
