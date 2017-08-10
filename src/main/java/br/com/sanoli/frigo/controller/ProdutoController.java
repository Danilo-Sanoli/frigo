package br.com.sanoli.frigo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sanoli.frigo.enums.TipoProduto;
import br.com.sanoli.frigo.model.Produto;
import br.com.sanoli.frigo.service.ProdutoService;

@CrossOrigin
@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@PostMapping(value = "/salvar")
	public void save(@RequestBody(required = false) Produto produto){
		Produto produto2 = new Produto(null, "Carne Seca", "Carne seca descrição", "", TipoProduto.CARNE, 20.50);
		Produto produto3 = new Produto(null, "Costela Suina", "Costela Suina", "", TipoProduto.CARNE, 20.50);
		Produto produto4 = new Produto(null, "Linguica de frango", "Linguica de frango descrição", "", TipoProduto.LINGUICA, 20.50);
		Produto produto5 = new Produto(null, "Asa de Frango", "Asa de Frango descrição", "", TipoProduto.CARNE, 20.50);
		Produto produto6 = new Produto(null, "Coxa de Frango", "Coxa de Frango descrição", "", TipoProduto.CARNE, 20.50);
		Produto produto7 = new Produto(null, "Picanha", "Picanha descrição", "", TipoProduto.CARNE, 20.50);
		Produto produto8 = new Produto(null, "Fraldinha", "Fraldinha descrição", "", TipoProduto.CARNE, 20.50);
		Produto produto9 = new Produto(null, "Patinho", "Patinho descrição", "", TipoProduto.CARNE, 20.50);
		Produto produto10 = new Produto(null, "Linguica Suina", "Linguica Suina descrição", "", TipoProduto.LINGUICA, 20.50);
		Produto produto11 = new Produto(null, "Cupim", "Cupim descrição", "", TipoProduto.CARNE, 20.50);
		
		service.save(produto2);
		service.save(produto3);
		service.save(produto4);
		service.save(produto5);
		service.save(produto6);
		service.save(produto7);
		service.save(produto8);
		service.save(produto9);
		service.save(produto10);
		service.save(produto11);
	}
	
	@GetMapping(produces = "application/json")
	@ResponseBody
	public List<Produto> findAll(Produto produto){
	 	return service.findAll();
	}
	
	@GetMapping(value = "/{id}")
	@ResponseBody
	public Produto findById(@PathVariable("id") Long id){
		return service.findOne(id);
	}
	
	@GetMapping(value = "descricao/{descricao}")
	@ResponseBody
	public List<Produto> findByDescricao(@PathVariable("descricao") String descricao){
		return service.findByDescricao(descricao);
	}
	
}
