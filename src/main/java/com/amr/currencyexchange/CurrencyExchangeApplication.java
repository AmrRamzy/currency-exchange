package com.amr.currencyexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@SpringBootApplication(exclude = {
//	    DataSourceAutoConfiguration.class, 
//	    DataSourceTransactionManagerAutoConfiguration.class, 
//	    HibernateJpaAutoConfiguration.class
//	})
@EnableDiscoveryClient
@SpringBootApplication
public class CurrencyExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeApplication.class, args);
	}

}
