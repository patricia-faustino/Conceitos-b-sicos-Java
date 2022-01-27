
public enum EstacoesDoAno {
	
	PRIMAVEIRA(0, "PRIMAVEIRA"),
	VERAO(1, "VERÃO"),
	INVERNO(2, "INVERNO"),
	OUTONO(3, "OUTONO");
	
	private int valor;
	private String descricaoString;
	
	 EstacoesDoAno(int valor, String descricao) {
		this.valor = valor;
		this.descricaoString = descricao;
	}

	public int getValor() {
		return valor;
	}

	public String getDescricaoString() {
		return descricaoString;
	}
	 
}
