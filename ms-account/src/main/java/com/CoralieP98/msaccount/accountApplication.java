package com.CoralieP98.msaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients
@RefreshScope
@ComponentScans({@ComponentScan("com.CoralieP98.msaccount.controller")})
@EnableJpaRepositories("com.CoralieP98.msaccount.repository")
@EntityScan("com.CoralieP98.msaccount.model")
public class accountApplication {

	public static void main(String[] args) {
		SpringApplication.run(accountApplication.class, args);
	}

}
