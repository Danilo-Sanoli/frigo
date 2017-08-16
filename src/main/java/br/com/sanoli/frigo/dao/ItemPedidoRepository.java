package br.com.sanoli.frigo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.sanoli.frigo.model.ItemPedido;
import br.com.sanoli.frigo.model.ItemPedidoPK;

public interface ItemPedidoRepository extends CrudRepository<ItemPedido, ItemPedidoPK>{
	
	@Query("select i from ItemPedido i where i.idPedido = :idPedido")
    List<ItemPedido> findByPedido(@Param("idPedido") Long idPedido);

}
