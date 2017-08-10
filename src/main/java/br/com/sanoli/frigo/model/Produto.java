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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_PRODUTO")
	private Long id;
	@Column(name = "DE_NOME")
	private String nome;
	@Column(name = "DE_DESCRICAO")
	private String descricao;
	@Column(name = "DE_URL_IMAGEM")
	private String urlImagem;
	@Column(name = "ID_TIPO")
	private TipoProduto tipoProduto;
	@Column(name = "NU_VALOR")
	private Double valor;

	protected Produto() {
		super();
	}

	public Produto(Long id, String nome, String descricao, String urlImagem, TipoProduto tipoProduto, Double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.urlImagem = urlImagem;
		this.tipoProduto = tipoProduto;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(long id) {
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
