package br.com.sanoli.frigo.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.sanoli.frigo.dao.PedidoRepository;
import br.com.sanoli.frigo.enums.StatusPedido;
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

	@Override
	public Pedido save(Long idCliente) {
		Pedido pedido = new Pedido();
		pedido.setIdCliente(idCliente);
		pedido.setDataPedido(new Date());
		pedido.setStatus(StatusPedido.EM_ANDAMENTO);
		return repository.save(pedido);
	}
	
	

}
