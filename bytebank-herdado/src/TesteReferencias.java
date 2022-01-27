
public class TesteReferencias {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();

		gerente.setNome("Marcos");
		gerente.setSalario(8000.00);
		gerente.autentica(123);

		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setSalario(5000.00);

		ControleBonificacao controleBonificacao = new ControleBonificacao();
		controleBonificacao.registraBonificacao(gerente);
		controleBonificacao.registraBonificacao(editorVideo);

		System.out.println(controleBonificacao.getSoma());
	}
}
