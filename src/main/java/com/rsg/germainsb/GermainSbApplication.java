package com.rsg.germainsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class GermainSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(GermainSbApplication.class, args);
	}

}