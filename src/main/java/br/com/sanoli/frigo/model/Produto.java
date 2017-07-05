package br.com.sanoli.frigo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sanoli.frigo.enums.TipoProduto;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "DE_DESCRICAO")
	private String descricao;

	@Column(name = "DE_URL_IMAGEM")
	private String urlImagem;

	//Teste
	@Column(name = "ID_TIPO")
	private TipoProduto tipoProduto;

	protected Produto() {
		super();
	}

	public Produto(String descricao, String urlImagem, TipoProduto tipoProduto) {
		super();
		this.descricao = descricao;
		this.urlImagem = urlImagem;
		this.tipoProduto = tipoProduto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

}
