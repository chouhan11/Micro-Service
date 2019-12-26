package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class CurrencyExchangeCostAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeCostAppApplication.class, args);
	}

}
