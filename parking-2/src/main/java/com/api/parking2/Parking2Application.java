package com.api.parking2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Parking2Application {

	public static void main(String[] args) {
		SpringApplication.run(Parking2Application.class, args);
	}

}
