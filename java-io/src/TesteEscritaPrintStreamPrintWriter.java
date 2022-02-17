import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("loremipsum2.txt", "UTF-8");

		PrintStream ps = new PrintStream("loremipsum2.txt");
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("id est laborum.");
		
		ps.close();
		pw.close();
		
		long millis = System.currentTimeMillis();
		System.out.println(millis);
	}

}
