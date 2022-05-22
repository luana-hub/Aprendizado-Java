package ByteBankHerdadoConta;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 2220);
		cc.deposita(100);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorDeImposto ci = new CalculadorDeImposto();
		ci.registra(sv);
		ci.registra(cc);
		System.out.println(ci.getTotalImposto());
	

	}

}
