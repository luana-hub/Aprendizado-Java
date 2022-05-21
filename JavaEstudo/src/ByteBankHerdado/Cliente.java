package ByteBankHerdado;

public class Cliente implements Autenticavel {
	private Autenticador at;

	public Cliente() {
		this. at = new Autenticador();
		
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
