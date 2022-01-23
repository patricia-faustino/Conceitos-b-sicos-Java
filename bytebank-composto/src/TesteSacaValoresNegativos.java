
public class TesteSacaValoresNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();

		conta.deposit(100);

		System.out.println(conta.withdraw(200));

		System.out.println(conta.getSaldo());

		//conta.saldo -= 101;
		System.out.println(conta.getSaldo());

	}

}
