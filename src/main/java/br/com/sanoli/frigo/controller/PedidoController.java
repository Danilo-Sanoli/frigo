package br.com.sanoli.frigo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.sanoli.frigo.model.Pedido;
import br.com.sanoli.frigo.service.PedidoService;

public class PedidoController {
	
	@Autowired
	private PedidoService service;
	
	@GetMapping
	@ResponseBody
	public List<Pedido> findAll(){
		return service.findAll();
	}
	
	public Pedido findById(Long id){
		return service.findOne(id);
	}

}
