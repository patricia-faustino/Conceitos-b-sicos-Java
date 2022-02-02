package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteArraysGuardadorDeContas {
	public static void main(String[] args) {
		GuardadorDeContas guardadorDeContas = new GuardadorDeContas();
		
		Conta contaCorrente = new ContaCorrente(11, 33);
		Conta contaPoupanca = new ContaPoupanca(11, 22);
		
		guardadorDeContas.adiciona(contaCorrente);
		guardadorDeContas.adiciona(contaPoupanca);
		int quantidadeDeElementos = guardadorDeContas.getQuantidadeDeElementos();
		
		Conta conta = guardadorDeContas.getReferencia(0);
		
		System.out.println(quantidadeDeElementos);
		
		System.out.println(conta.getNumero());
		
	}
}
