
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 120.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		float pontoFlutuante = 3.14f;
		
		long numeroGrande = 344444444444444445L;
		short valorPequeno = 2131;
		byte valorpequeninho = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println("Particularidades de opera��es com n�mero decimal: " + total);
	}
}
