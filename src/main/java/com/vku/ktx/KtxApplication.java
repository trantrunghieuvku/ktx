package com.vku.ktx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan("com.vku.ktx")
public class KtxApplication {

	public static void main(String[] args) {
		SpringApplication.run(KtxApplication.class, args);
	}

}
