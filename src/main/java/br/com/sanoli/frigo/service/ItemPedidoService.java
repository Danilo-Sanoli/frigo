package br.com.sanoli.frigo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sanoli.frigo.model.ItemPedido;
import br.com.sanoli.frigo.model.ItemPedidoPK;

@Service
public interface ItemPedidoService {

	public List<ItemPedido> findAll();
	public ItemPedido findOne(ItemPedidoPK id);
	public void save(ItemPedido pedido);
	public List<ItemPedido> findByIdPedido(Long id);
	
}
