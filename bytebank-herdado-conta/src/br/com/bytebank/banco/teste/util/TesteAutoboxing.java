package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;


public class TesteAutoboxing {
	public static void main(String[] args) {
		
		int valorMaximo = Integer.MAX_VALUE;
		int valorMinimo = Integer.MIN_VALUE;
		int byteDaReferencia = Integer.BYTES;
		
		System.out.println(valorMaximo);
		System.out.println(valorMinimo);
		System.out.println(byteDaReferencia);
	
		int idade = 29;
		Integer idadeRef = 29;
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idadeRef);
		//para lista aceitar um tipo primitivo ocorre o unboxing automaticamente 
		numeros.add(29);
		
		int valor = idadeRef.intValue();//unboxing Integer --> int
		String s = args[0];//"10"
		
		int numero = Integer.parseInt(s);
		
		System.out.println(numero);
		
	      Integer ref = Integer.valueOf("3");
	        ref++;
	        System.out.println(ref);
	}
}
