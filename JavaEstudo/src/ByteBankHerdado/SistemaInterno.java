package ByteBankHerdado;
//É NO SISTEMA INTERNO QUE DEFINIMOS A SENHA VÁLIDA
public class SistemaInterno {
	private int senha = 222;
	
	 public void autentica(Autenticavel fa) {
		boolean autenticou =  fa.autentica(this.senha);
		 if(autenticou) {
			System.out.println("Pode entrar,acesso permitido!");
		 }else {
			System.out.println("Sem permissão de acesso ao sistema!");
		}
	 }
}
