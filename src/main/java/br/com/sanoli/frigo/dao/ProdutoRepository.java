package br.com.sanoli.frigo.dao;

import javax.annotation.Resource;

import org.springframework.data.repository.CrudRepository;

import br.com.sanoli.frigo.model.Produto;

@Resource
public interface ProdutoRepository extends CrudRepository<Produto, Long>{
	
}
