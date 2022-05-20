package ByteBankHerdado;

public class Funcionario {
	private String nome;
	private String CPF;
	private double salario; 
	
	
	public double getBonificacao() {
		return this.salario * 0.1 ; // sig salario retorna 10% de bonificação	
	}
	
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
