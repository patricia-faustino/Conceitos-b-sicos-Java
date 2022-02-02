package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		//é um objeto
		// inicia com valores padrões do tipo
		// estrutura de dados
		int[] idades = new int[5];
		
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i;
			System.out.println(idades[i]);
		}
	}

}
