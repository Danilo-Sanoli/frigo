package br.com.sanoli.frigo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sanoli.frigo.model.Produto;
import br.com.sanoli.frigo.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@PostMapping(value = "/salvar")
	public void save(@RequestBody Produto produto){
		service.save(produto);
	}
	
	@GetMapping
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
