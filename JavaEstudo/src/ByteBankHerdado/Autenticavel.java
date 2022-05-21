package ByteBankHerdado;
//INTERFACE DEFINE CONTRATO E ESTE CONTRATO SE CHAMA AUTENTICAVEL
//QUEM ASSINA ESTE CONTRATTO PRECISA: implementar os metodos contidos nela ( setSenha e autentica)ATRAVÉS DA ASSINATURA implements

public abstract interface Autenticavel  {

		public abstract void setSenha(int senha);
		
		public abstract boolean autentica(int senha);

		}
	

	

