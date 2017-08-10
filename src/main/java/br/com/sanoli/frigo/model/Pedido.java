package br.com.sanoli.frigo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sanoli.frigo.enums.StatusPedido;

@Entity
@Table(name = "TB_PEDIDO")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_PEDIDO")
	private long id;
	@Column(name = "ID_STATUS")
	private StatusPedido status;
	@Column(name = "DT_PEDIDO")
	private Date dataPedido;
	@Column(name = "ID_CLIENTE")
	private Long idCliente;

	// private List<ItemPedido> itensDoPedido;

	public Pedido() {
		super();
	}

	public Pedido(StatusPedido status, Date dataPedido) {
		super();
		this.status = status;
		this.dataPedido = dataPedido;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

}
