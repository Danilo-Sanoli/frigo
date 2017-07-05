package br.com.sanoli.frigo.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.sanoli.frigo.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{
	
}
