package br.com.sanoli.frigo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ITEM_PEDIDO")
public class ItemPedido {

	@EmbeddedId
	private ItemPedidoPK pk;

	@JoinColumn(name = "ID_PEDIDO", insertable = false, updatable = false)
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Pedido pedido;

	@JoinColumn(name = "ID_PRODUTO", insertable = false, updatable = false)
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Produto produto;

	@Column(name = "ID_PEDIDO")
	private Long idPedido;

	@Column(name = "ID_PRODUTO")
	private Long idProduto;

	@Column(name = "DE_DESCRICAO")
	private String descricao;

	public ItemPedido() {
		super();
	}

	public ItemPedidoPK getPk() {
		return pk;
	}

	public void setPk(ItemPedidoPK pk) {
		this.pk = pk;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

}
