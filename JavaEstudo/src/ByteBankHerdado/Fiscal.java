package ByteBankHerdado;

public class Fiscal implements Autenticavel {
	private Autenticador at;

	public Fiscal() {
		this.at = new Autenticador();
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
