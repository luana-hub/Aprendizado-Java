package ByteBankHerdadoConta;

public abstract class Conta {
	protected double saldo;
	private double sacar;
	private int agencia;
	private int numero;
	private Cliente titular;
	private double valor;
	private static int total;

	//public Conta() {} posso tbm ter um construtor padrão e um costumizado na mesma classe
	


	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;

		//System.out.println("Estou criando um construtor para garantir a regra de negócio! ");

	}

	public abstract void deposita(double valor);

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;

		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
		
	}
		
	public double getSaldo() {
		return this.saldo;

	}

	public int getNumero() {
		return this.numero;
	}

	public int setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não é permitido número menor ou igual a 0. ");
			return numero;

		}
		return this.numero = numero;

	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não é permitido valor menor ou igual a 0. ");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente setTitular(Cliente titular) {
		return this.titular = titular;

	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;

	}
}
