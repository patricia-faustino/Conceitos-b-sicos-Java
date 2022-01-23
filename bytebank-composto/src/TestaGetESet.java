
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		conta.setTitular(new Cliente());
		
		conta.getTitular().setNome("Patricia Faustino");
		
		conta.getTitular().setProfissao("Desenvolvedora Full Stack");
	}

}
