
public class TestaCriacaoDeConta {
	public static void main(String[] args) {
		Cliente patricia = new Cliente();

		patricia.setNome("Patricia Faustino");
		patricia.setCpf("222.222.222-22");
		patricia.setProfissao("Desenvolvedora Full Stack");

		Conta contaPatricia = new Conta();
		//composição de objetos
		contaPatricia.setTitular(patricia);

		System.out.println(contaPatricia.getTitular().getNome());
	}
}
