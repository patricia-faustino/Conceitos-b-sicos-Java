
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 16;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;
		boolean podeEntrar = idade >= 18 || acompanhado;

		if (podeEntrar) {
			System.out.println("Seja bem vindo.");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}
	}
}
