package br.com.bytebank.banco.teste;

import java.util.Iterator;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Aluno";
		
		char charPosition2 = nome.charAt(2);
		
		int indexOf1 = nome.indexOf("Al");
		
		String nomeReplaceA = nome.replace("A", "a");
		
		String nomeToUpperCase = nome.toUpperCase();
		
		String vazio = " ";
		
		System.out.println(vazio.isBlank());
		System.out.println(vazio.trim().isEmpty());
		
		System.out.println(nome.contains("Al"));
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println(nome);
		System.out.println(nomeReplaceA);
		System.out.println(nomeToUpperCase);
		System.out.println(charPosition2);
		System.out.println(indexOf1);
	}
 
}
