
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(422,0123);
		contaCorrente.deposit(100.00);
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		CalculadorImposto calculadorImposto = new CalculadorImposto();
		calculadorImposto.registra(contaCorrente);
		calculadorImposto.registra(seguroDeVida);
		

		System.out.println(calculadorImposto.getValorImposto());
	}

}
