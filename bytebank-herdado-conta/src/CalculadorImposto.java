
public class CalculadorImposto implements Tributavel{
 
	private double totalImposto;
	
	public void registra(Tributavel tributavel) {
		double valor = tributavel.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getValorImposto() {
		return this.totalImposto;
	}
}
