package ByteBankHerdadoConta;

public class Teste {
/* implementando Thread -> que é uma linha de execução onde vc pode estabelecer prioridades.
	public static void main(String[] args) {
		Thread t = new Thread();System.out.println("Rodando...");
//mantendo o padrão dinâmico não uso um valor fixo uso o atributo MAX OBS :max.priority é um int
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();}*/
	
	//iniciando implementação de enuns
	
	
	public static void main(String[] args) {
		Prioridade pMin = Prioridade.MIN;
		Prioridade pNorm = Prioridade.NORMAL;
		Prioridade pMax = Prioridade.MAX;
		
		System.out.println(pMin.ordinal());
		System.out.println(pNorm.ordinal());
		System.out.println(pMax.ordinal());
		
		System.out.println(pMin.name());
		System.out.println(pNorm.name());
		System.out.println(pMax.name());
		
		
		System.out.println(pMin.getValor());
		System.out.println(pNorm.getValor());
		System.out.println(pMax.getValor());
		
		
	}

}
