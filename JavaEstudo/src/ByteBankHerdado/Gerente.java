package ByteBankHerdado;

// LEIA GERENTE É UM FUNCIONARIO.OU GERENTE HERDA DA CLASSE FUNCIONARIO,ASSINA A CLASSE AUTENTICAVEL.Eh UM AUTENTICAVEL
public class Gerente extends Funcionario implements Autenticavel {
	private Autenticador at;
	// criando
	public Gerente() {
		this.at = new  Autenticador();
	}

	// chamando o metodo getbonificação da classe mãe para não ter que reescreve-lo
	// mesmo que ele seja modificado.
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do gerente!");
		return super.getSalario();
	}
   // delegando
	@Override
	public void setSenha(int senha) {
		this.at.setSenha(senha);;
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.at.autentica(senha);
		
	
	}

	
	

}
