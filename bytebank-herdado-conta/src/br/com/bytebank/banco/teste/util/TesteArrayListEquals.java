package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		//ArrayList é honeroso para exclusão
		// LinkedList é honeroso a interação
		List<Conta> listaConta = new LinkedList<Conta>();
		
		Conta contaCorrente = new ContaCorrente(11, 33);
		Conta contaCorrente2 = new ContaCorrente(11, 22);
		
		
		listaConta.add(contaCorrente);
		listaConta.add(contaCorrente2);

		Conta contaCorrente3 = new ContaCorrente(11, 22);
		
		boolean ehIgual = listaConta.contains(contaCorrente3);
		
		System.out.println(ehIgual);
	}

}
