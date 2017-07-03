package br.com.sanoli.frigo;

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
		dataSource.setUrl("jdbc:mysql://localhost:3306/frigo_db");
		dataSource.setUsername("root");
		return dataSource;
	}

}
