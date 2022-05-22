package ByteBankHerdadoConta;
//método abstrato devolve um double se chama getValorImposto
public interface Tributavel {
	//public abstract - não preciso escrever pois tudo dentro da interface é publico e abstrato
	double getValorImposto();

}
