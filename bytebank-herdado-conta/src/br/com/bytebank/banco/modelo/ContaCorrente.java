package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void withdraw(double valor) throws SaldoInsuficienteException {
		double valorMaisTaxa = valor + 0.2;
		super.withdraw(valorMaisTaxa);
	}

	@Override
	public void deposit(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta Corrente. " +  super.toString();
	}
}
