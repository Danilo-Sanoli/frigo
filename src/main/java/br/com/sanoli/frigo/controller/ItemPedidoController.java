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

import br.com.sanoli.frigo.model.ItemPedido;
import br.com.sanoli.frigo.model.ItemPedidoPK;
import br.com.sanoli.frigo.service.ItemPedidoService;

@CrossOrigin
@RestController
@RequestMapping("/item")
public class ItemPedidoController {
	
	@Autowired
	private ItemPedidoService service;
	
	@PostMapping(value = "/salvar")
	public void save(@RequestBody ItemPedido itemPedido){
		ItemPedidoPK pk = new ItemPedidoPK();
		pk.setPedido(itemPedido.getIdPedido());
		pk.setProduto(itemPedido.getIdProduto());
		itemPedido.setPk(pk);
		service.save(itemPedido);
	}
	
	@GetMapping
	@ResponseBody
	public List<ItemPedido> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public ItemPedido findById(@PathVariable("id") ItemPedidoPK id){
		return service.findOne(id);
	}
	
	@GetMapping("pedido/{id}")
	@ResponseBody
	public List<ItemPedido> findByIdPedido(@PathVariable("id") Long id){
		return service.findByIdPedido(id);
	}

}
