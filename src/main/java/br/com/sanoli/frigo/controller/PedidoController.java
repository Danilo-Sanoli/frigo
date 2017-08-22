package br.com.sanoli.frigo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sanoli.frigo.model.Pedido;
import br.com.sanoli.frigo.service.PedidoService;

@CrossOrigin
@RestController
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService service;
	
	@PostMapping(value = "/salvar/{id}")
	public Pedido save(@PathVariable("id") Long idCliente){
		return service.save(idCliente);
	}
	
	@GetMapping
	@ResponseBody
	public List<Pedido> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public Pedido findById(@PathVariable("id") Long id){
		return service.findOne(id);
	}

}
