package ByteBankComposto;

public class TestaBanco {

	public static void main(String[] args) {
		Cliente Paulo = new Cliente();
		Paulo.nome = "Paulo Silva";
		Paulo.CPF = "222.222.222.22";
		Paulo.profissão = "Engenheiro";
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		//ASSOCIA O CLIENTE PAULO A CONTA DO PAULO
		contaDoPaulo.titular = Paulo;
		System.out.println(contaDoPaulo.titular.nome);
	}

}
