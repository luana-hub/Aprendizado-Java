package ByteBankByteBankEncapsulado;

public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1245, 236809);
		Conta conta2 = new Conta(1245, 236889);
		Conta conta3 = new Conta(1245, 236880);
		System.out.println(Conta.getTotal());
	}
	
	
}
