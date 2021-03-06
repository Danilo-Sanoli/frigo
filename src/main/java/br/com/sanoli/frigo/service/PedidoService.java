package br.com.sanoli.frigo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sanoli.frigo.model.Pedido;

@Service
public interface PedidoService {
	
	public List<Pedido> findAll();
	public Pedido findOne(Long id);
	public Pedido save(Long idCliente);
	public void alteraStatusPedido(Long idPedido, Long idStatus);

}
