package br.com.sanoli.frigo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.sanoli.frigo.dao.ProdutoRepository;
import br.com.sanoli.frigo.model.Produto;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody void salvar(Produto produto){
		repository.save(produto);
	}
	
}
