
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticacaoUtil;

	public Gerente() {
		this.autenticacaoUtil = new AutenticacaoUtil();
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticacaoUtil.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticacaoUtil.setSenha(senha);
	}
	@Override
	public double getBonificacao() {
		// super: atributo vem diretamente do pai
		return super.getSalario();
	}
}
