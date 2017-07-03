package br.com.sanoli.frigo.enums;

public enum TipoProduto {

	CARNE("CARNE"), LINGUICA("LINGUIÇA");

	private String descricao;

	private TipoProduto(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
