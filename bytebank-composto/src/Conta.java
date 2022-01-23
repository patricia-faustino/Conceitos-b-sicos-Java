public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	private static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public Conta() {
		Conta.total++;
	}

	public void deposit(double valor) {
		this.saldo += valor;
	}

	public boolean withdraw(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfer(Conta contaDestino, double valor) {
		if (this.saldo >= 0) {
			withdraw(valor);
			contaDestino.deposit(valor);
			return true;
		}
		return false;
	}
	
	 public double getSaldo() {
		return saldo;
	}
	 
		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}
		

		public Cliente getTitular() {
			return titular;
		}

		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		

		public static int getTotal() {
			return total;
		}
		

}
