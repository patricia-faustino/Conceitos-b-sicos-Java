
public class SistemaInterno {

	private int senha = 123;

	public void autentica(Autenticavel autenticavel) {
		boolean autenticado = autenticavel.autentica(this.senha);
		if (autenticado) {
			System.out.println("Pode entrar no sistema");
			return;
		}
		System.out.println("N�o pode entrar no sistema");
	}
}
