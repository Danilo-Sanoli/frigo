package br.com.sanoli.frigo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ItemPedidoPK implements Serializable{

	private static final long serialVersionUID = -3116510137176921522L;
	
	@Column(name="CD_PEDIDO")
	private int pedido;
	@Column(name="CD_PRODUTO")
	private int produto;
	
	public ItemPedidoPK() {
		super();
	}

	public ItemPedidoPK(int pedido, int produto) {
		super();
		this.pedido = pedido;
		this.produto = produto;
	}

	public int getPedido() {
		return pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}

	public int getProduto() {
		return produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}
	
	

}
