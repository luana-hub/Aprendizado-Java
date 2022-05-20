package ByteBankHerdado;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Roberto Chaves");
		g1.setCPF("09987654323460");
		g1.setSalario(6000.0);
		g1.setSenha(222);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCPF());
		System.out.println(g1.getSalario());

		boolean autenticou = g1.autentica(222);
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());

	}

}
