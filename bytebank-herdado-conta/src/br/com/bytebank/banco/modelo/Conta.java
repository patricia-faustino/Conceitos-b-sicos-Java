package br.com.bytebank.banco.modelo;

/**
 * Classe que representa uma moldura de uma Conta
 * 
 * @author patricia.faustino
 *
 */

public abstract class Conta {
	double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	private static int total;

	/**
	 * Construtor para inicializar o objeto Conta a partir da agência e número
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	public Conta() {
		Conta.total++;
	}

	public abstract void deposit(double valor);

	/**
	 * Atenção: valor tem que ser maior que o saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void withdraw(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfer(Conta contaDestino, double valor) throws SaldoInsuficienteException {
		this.withdraw(valor);
		contaDestino.deposit(valor);
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
