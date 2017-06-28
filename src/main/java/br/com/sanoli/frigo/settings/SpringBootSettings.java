package br.com.sanoli.frigo.settings;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@SpringBootApplication
public class SpringBootSettings {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSettings.class, args);
	}
	
	@Bean
	public DataSource createDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl(""); // Criar banco de dados local para testes
		dataSource.setUsername(""); // Criar usuario para testes
		dataSource.setPassword(""); // Criar senha para usuário
		return dataSource;
	}

}
