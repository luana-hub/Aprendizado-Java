package ByteBankHerdado;

public class TestaFuncionario {

	public static void main(String[] args) {
		Gerente nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCPF("223355646-9");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

    }

	}


