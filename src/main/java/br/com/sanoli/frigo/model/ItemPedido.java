package br.com.sanoli.frigo.model;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_ITEM_PEDIDO")
public class ItemPedido {
	
	@EmbeddedId
	private ItemPedidoPK pk;
	
	@JoinColumn(name="ID_PEDIDO")
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Pedido pedido;
	
	@JoinColumn(name="ID_PRODUTO")
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Produto produto;
	
	private int quantidade;

	public ItemPedido() {
		super();
	}
	
	public ItemPedido(ItemPedidoPK pk, int quantidade) {
		super();
		this.pk = pk;
		this.quantidade = quantidade;
	}

	public ItemPedidoPK getPk() {
		return pk;
	}

	public void setPk(ItemPedidoPK pk) {
		this.pk = pk;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
	
}
