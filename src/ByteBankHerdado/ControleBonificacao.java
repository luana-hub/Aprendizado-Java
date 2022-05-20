package ByteBankHerdado;

public class ControleBonificacao {
	private double soma;// o que quero fazer?

	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}

	public double getSoma() {
		return soma;

	}

}
