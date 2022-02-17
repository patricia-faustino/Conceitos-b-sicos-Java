import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args)  throws FileNotFoundException{
		
		//new File("contas.csv") --> representação do arquivo
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoDeConta = linhaScanner.next();
			int numeroDaConta = linhaScanner.nextInt();
			int agencia = linhaScanner.nextInt();
			String nomeTitular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			System.out.println("Tipo Conta: " + tipoDeConta);
			System.out.println("Número: " + numeroDaConta);
			System.out.println("Agencia: " + agencia);
			System.out.println("Nome Titular: " + nomeTitular);
			System.out.println("Saldo: " + saldo);
			System.out.println();
			
			System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d , %20s: %05.2f %n", tipoDeConta, agencia, numeroDaConta, nomeTitular, saldo);
			
			linhaScanner.close();
		}

		scanner.close();
	}

}
