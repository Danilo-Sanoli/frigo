package br.com.sanoli.frigo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.sanoli.frigo.dao.PedidoRepository;
import br.com.sanoli.frigo.model.Pedido;
import br.com.sanoli.frigo.service.PedidoService;

@Component
public class PedidoServiceImpl implements PedidoService{

	@Autowired
	private PedidoRepository repository;
	
	@Override
	public List<Pedido> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public Pedido findOne(Long id) {
		return repository.findOne(id);
	}
	
	

}
