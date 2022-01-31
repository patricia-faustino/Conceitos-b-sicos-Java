package br.com.bytebank.banco.teste;

public class TesteReplaceAll {
	public static void main(String[] args) {
		String cpf = "022.222.222-22";
		
		String cep = "40252-278";
		
		System.out.println(formataDados(cep));
		System.out.println(formataDados(cpf));
	
	}
	
	public static String formataDados(String dado) {
		return dado.replaceAll("[^0-9]", "");
	}

}
