import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
		Cliente cliente = new Cliente();
		cliente.setCpf("234567586");
		cliente.setNome("Patricia Faustino");
		cliente.setProfissao("Desenvolvedora");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		objectOutputStream.writeObject(cliente);
		objectOutputStream.close();
		
//		//� a cria��o de um objeto a partir de um fluxo bin�rio de dados
//		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cliente.bin"));
//		//l� a serializa��o e devolve o objeto mais generico poss�vel
//		Cliente cliente =  (Cliente)objectInputStream.readObject();
//		
//		System.out.println(cliente.getNome());
//		
	}
}
