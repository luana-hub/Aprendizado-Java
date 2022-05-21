package ByteBankHerdado;
//NÃO PODE INSTÊNCIAR OBJETOS DESTA CLASSE PORQ ELA É ABSTRATA

public abstract class Funcionario {

	private String nome;
	private String CPF;
	private double salario;
	// MÉTODO SEM CORPO
	public abstract double getBonificacao();//existe para os filhos mas não retorna nada pois a bonificação é específica para casa funcionario.
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
