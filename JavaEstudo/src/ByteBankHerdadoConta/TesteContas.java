package ByteBankHerdadoConta;

public class TesteContas {
	
	public static void main(String[] args) {
		
		
		ContaCorrente cc = new ContaCorrente(123, 234560);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(111, 0231415);
		cp.deposita(200.0);
		
		cc.transfere(10, cp);
		System.out.println("CP: " + cp.getSaldo());
		System.out.println("CC: " + cc.getSaldo());
	

	}

}
