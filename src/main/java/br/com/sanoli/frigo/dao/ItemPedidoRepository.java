package br.com.sanoli.frigo.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.sanoli.frigo.model.ItemPedido;
import br.com.sanoli.frigo.model.ItemPedidoPK;

public interface ItemPedidoRepository extends CrudRepository<ItemPedido, ItemPedidoPK>{

}
