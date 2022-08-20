package com.api.ParkingControl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;//imported for the exclude

@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ParkingControlApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(ParkingControlApplication.class, args);}
		
		@GetMapping("/")
		public String index() 
		{
			return "Olá Peixe !";
		}
}
