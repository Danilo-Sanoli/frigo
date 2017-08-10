package br.com.sanoli.frigo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.sanoli.frigo.dao.ItemPedidoRepository;
import br.com.sanoli.frigo.model.ItemPedido;
import br.com.sanoli.frigo.model.ItemPedidoPK;
import br.com.sanoli.frigo.service.ItemPedidoService;

@Component
public class ItemPedidoServiceImpl implements ItemPedidoService {

	@Autowired
	private ItemPedidoRepository repository;
	
	@Override
	public List<ItemPedido> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public ItemPedido findOne(ItemPedidoPK id) {
		return repository.findOne(id);
	}

	@Override
	public void save(ItemPedido pedido) {
		repository.save(pedido);
	}

}
