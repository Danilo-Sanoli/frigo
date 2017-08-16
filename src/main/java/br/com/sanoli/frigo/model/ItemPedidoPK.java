package br.com.sanoli.frigo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ItemPedidoPK implements Serializable{

	private static final long serialVersionUID = -3116510137176921522L;
	
	@Column(name="CD_PEDIDO")
	private Long pedido;
	@Column(name="CD_PRODUTO")
	private Long produto;
	
	public ItemPedidoPK() {
		super();
	}

	public ItemPedidoPK(Long pedido, Long produto) {
		super();
		this.pedido = pedido;
		this.produto = produto;
	}

	public Long getPedido() {
		return pedido;
	}

	public void setPedido(Long pedido) {
		this.pedido = pedido;
	}

	public Long getProduto() {
		return produto;
	}

	public void setProduto(Long produto) {
		this.produto = produto;
	}
	
	

}
