package ByteBankComposto;

public class TestaSacaValoresNegativos {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.sacar(200));
		conta.sacar(101);
		
		//QUERO QUE ISTO SEJA PROIBIDO PARA ISSO BASTA PRIVAR O ATRIBUTO,DESTA FORMA SÓ CONSIGO USAL-LO CHAMANDO ATRAVÉS DO MÉTODO
		System.out.println(conta.getSaldo());
		

	}

}
