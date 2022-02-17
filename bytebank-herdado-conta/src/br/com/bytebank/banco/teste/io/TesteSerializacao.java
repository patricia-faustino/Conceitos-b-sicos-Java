package br.com.bytebank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Cliente cliente = new Cliente();
		cliente.setCpf("234567586");
		cliente.setNome("Patricia Faustino");
		cliente.setProfissao("Desenvolvedora");
		
		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		contaCorrente.setTitular(cliente);
		contaCorrente.deposit(222.3);
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		objectOutputStream.writeObject(contaCorrente);
		objectOutputStream.close();
	}
}
