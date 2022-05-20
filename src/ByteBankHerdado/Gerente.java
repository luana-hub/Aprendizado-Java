package ByteBankHerdado;

// LEIA GERENTE É UM FUNCIONARIO.OU GERENTE HERDA DA CLASSE FUNCIONARIO
public class Gerente extends Funcionario {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	// chamando o metodo getbonificação da classe mãe para não ter que reescreve-lo
	// mesmo que ele seja modificado.
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do gerente!");
		return super.getBonificacao() + super.getSalario();
	}

	// É A INDICAÇÃO QUE SALARIO VEM DA SUPER CLASSE OU CLASSE MÃE (EM CLASSE FILHA
	// TROCAMOS O this POR super)
}
