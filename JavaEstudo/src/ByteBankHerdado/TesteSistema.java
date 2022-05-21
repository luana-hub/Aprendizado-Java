package ByteBankHerdado;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(222);
		
		Administrador adm = new Administrador();
		adm.setSenha(111);
		
		Fiscal fis = new Fiscal();
		fis.setSenha(222);
		
		Cliente cli = new Cliente();
		cli.setSenha(000);
		
		
		SistemaInterno sis = new SistemaInterno();
		sis.autentica(g);
		sis.autentica(adm);
		sis.autentica(fis);
		sis.autentica(cli);
	}

}
