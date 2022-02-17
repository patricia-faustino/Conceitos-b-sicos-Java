package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDesserializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream objectInputStream = new ObjectInputStream(
				new FileInputStream("cc.bin"));
		ContaCorrente contaCorrente= (ContaCorrente)objectInputStream.readObject();
		objectInputStream.close();
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaCorrente.getTitular());
		System.out.println(contaCorrente.getSaldo());
	}
}
