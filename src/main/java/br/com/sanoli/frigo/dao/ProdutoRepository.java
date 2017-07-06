package br.com.sanoli.frigo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sanoli.frigo.model.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long>{
	
	public List<Produto> findByDescricaoContaining(String descricao);
	
}
