package br.com.sanoli.frigo;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import br.com.sanoli.frigo.dao.ItemPedidoRepository;
import br.com.sanoli.frigo.dao.PedidoRepository;
import br.com.sanoli.frigo.dao.ProdutoRepository;
import br.com.sanoli.frigo.enums.StatusPedido;
import br.com.sanoli.frigo.enums.TipoProduto;
import br.com.sanoli.frigo.model.ItemPedido;
import br.com.sanoli.frigo.model.ItemPedidoPK;
import br.com.sanoli.frigo.model.Pedido;
import br.com.sanoli.frigo.model.Produto;

@SpringBootApplication
public class SpringBootSettings {
	
	private static final Logger log = LoggerFactory.getLogger(SpringBootSettings.class);
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootSettings.class, args);
		
	}
	
	@Bean
	public DataSource createDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/frigo_db");
		dataSource.setUsername("root");
		return dataSource;
	}
	
	/* Os testes também preenchem o banco para que possam ser feitos outros testes */
	@Bean
	public CommandLineRunner testePedido(PedidoRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Pedido(StatusPedido.PAGO, "01/01/2001"));

			// fetch all customers
			log.info("Found with findAll():");
			log.info("-------------------------------");
			for (Pedido pedido : repository.findAll()) {
				log.info(pedido.getDataPedido());
			}
			log.info("");
		};
	}

	@Bean
	public CommandLineRunner testeProduto(ProdutoRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Produto("produto001", "urlImg", TipoProduto.CARNE));
			repository.save(new Produto("teste", "urlImg", TipoProduto.CARNE));
			repository.save(new Produto("teste01", "urlImg", TipoProduto.CARNE));

			// fetch all customers
			log.info("Found with findAll():");
			log.info("-------------------------------");
			for (Produto produto: repository.findByDescricaoContaining("teste")) {
				log.info(produto.getDescricao());
			}
			log.info("");
		};
	}
	
	@Bean
	public CommandLineRunner testeItemPedido(ItemPedidoRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new ItemPedido(new ItemPedidoPK(0, 0),
					20));

			// fetch all customers
			log.info("Found with findAll():");
			log.info("-------------------------------");
			for (ItemPedido itemPedido : repository.findAll()) {
				log.info(Integer.toString(itemPedido.getQuantidade()));
			}
			log.info("");
		};
	}
}
