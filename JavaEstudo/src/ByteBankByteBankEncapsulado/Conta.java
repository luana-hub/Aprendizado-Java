package ByteBankByteBankEncapsulado;

public class Conta {
	private double saldo;
	private double sacar;
	private int agencia;
	private int numero;
	private Cliente titular;
	private double valor;
	private static int total;//significa ete total é da classe conta,não um atributo do objeto conta

	// CRIANDO CONSTRUTOR (rotina de inicialização)
	public Conta(int agencia, int numero) {// agora a conta não pode mais ser inicializada por 0 como default
		Conta.total++;
		System.out.println("O total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;

		System.out.println("Estou criando um construtor para garantir a regra de negócio! ");

	}

	public void deposita(double valor) {
		this.saldo += valor;

	}

	public boolean saca(double valor) {
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

	public int getNumero() {
		return this.numero;
	}

//UMA VEZ QUE PASSOU COMO PARAMETRO NO CONSTRUTOR SE A REGRA DE NEGÓCIO DISSER QUE UMA CONTA NÃO PODE SER REAPROVEITADA ISTO SE TORNA DESNECESSÁRIO.
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
			return; // ESTE RETURN SEM NADA EM VOID SIGNIFICA PARE A EXECUÇÃO!
		}
		this.agencia = agencia;
	}

	public Cliente setTitular(Cliente titular) {
		return this.titular = titular;

	}

	public Cliente getTitular() {
		return this.titular;
	}
	public static int getTotal(){ //este método é da classe posso chamalo pelo nome da classe
		return Conta.total;
		
	}
}
