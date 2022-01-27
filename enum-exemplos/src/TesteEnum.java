
public class TesteEnum {

	public static void main(String[] args) {
		EstacoesDoAno verao = EstacoesDoAno.VERAO;
		
		System.out.println(verao.getDescricaoString());
		System.out.println(verao.getValor());
		System.out.println(verao.name());
		System.out.println(verao.ordinal());
		System.out.println(verao.toString());
	}

}
