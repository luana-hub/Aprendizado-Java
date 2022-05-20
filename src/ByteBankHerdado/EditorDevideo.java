package ByteBankHerdado;

public class EditorDevideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do ev!");
		return super.getBonificacao() + 100;

	}

}
