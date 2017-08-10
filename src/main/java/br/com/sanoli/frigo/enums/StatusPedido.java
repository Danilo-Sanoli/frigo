package br.com.sanoli.frigo.enums;

public enum StatusPedido {

	EM_ANDAMENTO("EM ANDAMENTO"), FINALIZADO("FINALIZADO"), CANCELADO("CANCELADO");

	private String descricao;

	StatusPedido(String descricao) {
		descricao = this.descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
