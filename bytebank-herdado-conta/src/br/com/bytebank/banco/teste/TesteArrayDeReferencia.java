package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencia {
	public static void main(String[] args) {
		ContaCorrente[] contaCorrentes = new  ContaCorrente[5];
		
		ContaCorrente contaCorrente1 = new ContaCorrente(123, 456);
		
		ContaCorrente contaCorrente2 = new ContaCorrente(223, 234);
		
		contaCorrentes[0] = contaCorrente1 ;
		contaCorrentes[1] = contaCorrente2;
		
		System.out.println(contaCorrentes[0].getNumero() );
		
		ContaPoupanca[] contas = new ContaPoupanca[10];
		ContaPoupanca cp1 = new ContaPoupanca(11,22);
		ContaPoupanca cp2 = new ContaPoupanca(33,44);

		contas[0] = cp1;
		contas[4] = cp2;

		//System.out.println(contas[1].getNumero());
	}
}
