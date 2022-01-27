
public class TesteSaca {

	public static void main(String[] args) {
		Conta conta =  new ContaCorrente(123, 123);
		
		conta.deposit(200.00);
		
		try {
			conta.withdraw(290.0);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}

}
