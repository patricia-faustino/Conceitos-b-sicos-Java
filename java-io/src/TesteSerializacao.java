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
	
		//serializa o objeto: � a transforma��o de um objeto em um fluxo bin�rio 
		//objectOutputStream.writeObject(nome);
		
		//objectOutputStream.close();
		
		//� a cria��o de um objeto a partir de um fluxo bin�rio de dados
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objeto.bin"));
		//l� a serializa��o e devolve o objeto mais generico poss�vel
		String nome =  (String)objectInputStream.readObject();
		
		System.out.println(nome);
		
	}
}
