package ByteBankHerdado;

public class Administrador extends Funcionario implements Autenticavel {
	
	 private Autenticador at;
	 
	 public Administrador() {
		 this.at = new Autenticador();
	 }
	@Override
	public double getBonificacao() {
		return 50;
	}
	@Override
	public void setSenha(int senha) {
	this.at.setSenha(senha);
		
	}
	@Override
	public boolean autentica(int senha) {
		return this.at.autentica(senha);
	
		
	}

	


}
