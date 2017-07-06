package br.com.sanoli.frigo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.sanoli.frigo.model.Pedido;
import br.com.sanoli.frigo.model.Produto;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{
	
}
