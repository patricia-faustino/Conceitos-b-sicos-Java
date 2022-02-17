import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//String nome = "Patricia Faustino";
		
		//ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
	
		//serializa o objeto: é a transformação de um objeto em um fluxo binário 
		//objectOutputStream.writeObject(nome);
		
		//objectOutputStream.close();
		
		//é a criação de um objeto a partir de um fluxo binário de dados
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objeto.bin"));
		//lê a serialização e devolve o objeto mais generico possível
		String nome =  (String)objectInputStream.readObject();
		
		System.out.println(nome);
		
	}
}
