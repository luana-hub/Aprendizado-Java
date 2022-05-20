package ByteBankByteBankEncapsulado;

public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(123,324567);
		// NÃO COMPILA -> conta.getNumero = 1223;
		conta.setNumero(123);
		System.out.println(conta.getNumero());

		Cliente paulo = new Cliente();

		paulo.setNome("Paulo Silveira");

		conta.setTitular(paulo);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("Desenvolvedor");
		System.out.println(conta.getTitular().getProfissao());

	}

}
