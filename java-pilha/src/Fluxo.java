
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("In�cio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			String mensagemException = ex.getMessage();
			System.out.println("Exception " + mensagemException);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println(" In�cio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("In�cio do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);

			int a = i / 0;
			// Conta conta = null;
			// conta.getAgencia();
		}
		System.out.println("Fim do metodo2");
	}
}
