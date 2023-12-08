package com.Proy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.Proy.dto")
public class MedicosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicosApiApplication.class, args);
	}

}
