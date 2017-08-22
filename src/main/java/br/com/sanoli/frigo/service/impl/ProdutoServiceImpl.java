package br.com.sanoli.frigo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.sanoli.frigo.dao.ProdutoRepository;
import br.com.sanoli.frigo.enums.TipoProduto;
import br.com.sanoli.frigo.model.Produto;
import br.com.sanoli.frigo.service.ProdutoService;

@Component
public class ProdutoServiceImpl implements ProdutoService{
	
	@Autowired
	ProdutoRepository repository;

	@Override
	public List<Produto> findByDescricao(String descricao) {
		return repository.findByDescricaoContaining(descricao);
	}

	@Override
	public void save(Produto produto) {
		produto.setTipoProduto(TipoProduto.LINGUICA);
		repository.save(produto);
	}

	@Override
	public Produto findOne(long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Produto> findAll() {
		return Lists.newArrayList(repository.findAll());
	}
	
	

}
