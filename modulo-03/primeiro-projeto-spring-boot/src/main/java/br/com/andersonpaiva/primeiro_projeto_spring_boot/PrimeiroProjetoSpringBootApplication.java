package br.com.andersonpaiva.primeiro_projeto_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.andersonpaiva")
public class PrimeiroProjetoSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(PrimeiroProjetoSpringBootApplication.class, args);
	}

}
