package br.com.sanoli.frigo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sanoli.frigo.model.Produto;

@Service
public interface ProdutoService {
	
	public Produto findOne(long id);
	public List<Produto> findAll();
	public List<Produto> findByDescricao(String descricao);
	public void save(Produto produto);

}
