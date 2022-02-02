package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteUtil {
	public static void main(String[] args) {
		ArrayList<Conta> listaConta = new ArrayList<Conta>();
		
		Conta contaCorrente = new ContaCorrente(11, 33);
		Conta contaPoupanca = new ContaPoupanca(11, 22);
		
		ArrayList lista = new ArrayList(26); //capacidade inicial
		
		lista.add("RJ");
		lista.add("SP");
		//outros estados
		ArrayList nova = new ArrayList(lista); //criando baseado na primeira lista
		
		listaConta.add(contaCorrente);
		listaConta.add(contaPoupanca);
		
		Conta ref = listaConta.get(0);
		
		System.out.println(listaConta.size());
		
		listaConta.remove(0);
		
		System.out.println(listaConta.size());
		
		Conta contaCorrente2 = new ContaCorrente(311, 333);
		Conta contaPoupanca2 = new ContaPoupanca(311, 322);
		
		listaConta.add(contaCorrente2);
		listaConta.add(contaPoupanca2);
		
		for(int i = 0; i < listaConta.size(); i++) {
			System.out.println(listaConta.get(i));
		}
		
		System.out.println("---------------");
		
		for(Conta conta : listaConta) {
			System.out.println(conta);
		}
	}
}
