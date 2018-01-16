package decisao.entity.enums;

public enum SituacaoLivro {
	
	DIARIO(1, "Diário"),
	RAZAO(2, "Razão");
	
	private int cod;
	private String descricao;
	private SituacaoLivro(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	public int getCod() {
		return cod;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public static SituacaoLivro toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
	}
		for(SituacaoLivro x : SituacaoLivro.values()) {
			
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);

	}
}
