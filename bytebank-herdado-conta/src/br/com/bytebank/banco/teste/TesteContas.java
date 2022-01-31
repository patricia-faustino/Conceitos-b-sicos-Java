package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.deposit(400.00);

		ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
		contaPoupanca.deposit(200.00);
		try {
			contaCorrente.transfer(contaPoupanca, 10.0);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
		System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());

	}
}
