package br.com.sanoli.frigo.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.sanoli.frigo.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
