package com.project.ohmycat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OhmycatApplication {

	public static void main(String[] args) {
		SpringApplication.run(OhmycatApplication.class, args);
	}

}
