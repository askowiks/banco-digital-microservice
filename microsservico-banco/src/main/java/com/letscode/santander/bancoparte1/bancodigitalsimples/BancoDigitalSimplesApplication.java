package com.letscode.santander.bancoparte1.bancodigitalsimples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BancoDigitalSimplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoDigitalSimplesApplication.class, args);
		System.out.println("\nBanco rodando!!!\n\n");
	}

}
