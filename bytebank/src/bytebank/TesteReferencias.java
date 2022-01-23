package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 500;

		Conta segundaConta = primeiraConta;

		segundaConta.saldo += 1000;

		System.out.println(primeiraConta.saldo);

		System.out.println(segundaConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("As contas são iguais");
		} else {
			System.out.println("As contas são diferentes");
		}
	}

}
