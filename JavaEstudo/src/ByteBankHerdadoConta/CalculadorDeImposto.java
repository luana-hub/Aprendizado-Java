package ByteBankHerdadoConta;

public class CalculadorDeImposto {
	
	private double totalImposto;
	
	//tudo que é tributavel pode usar o registra
	public void registra(Tributavel t) {
	double valorImposto =	t.getValorImposto(); //t.getValorImposto() devolve um double valorImposto
	this.totalImposto += valorImposto;
	}
	public double getTotalImposto() {
		return totalImposto;
	}

}
