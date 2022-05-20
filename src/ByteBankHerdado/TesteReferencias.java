package ByteBankHerdado;

public class TesteReferencias {
	/*
	 * isto se chama polimorfismo é chamar um objeto atraves de duas formas o ipo de
	 * ele e o tipo pai( gerente é um objeto da pai funcionario logo eu posso chamar
	 * ele atraves dele mesmo ou pelo tipo pai funcionario
	 */

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Luiz");
		g1.setSalario(3000.0);

		Funcionario f = new Funcionario();
		f.setSalario(2000.0);

		EditorDevideo ev = new EditorDevideo();
		f.setSalario(1400.0);

		Funcionario desig = new Designer();
		f.setSalario(5000.00); 
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		controle.registra(desig);

		System.out.println(controle.getSoma());

	}

}
