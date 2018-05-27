package com.ayungan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ClinicaEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicaEurekaApplication.class, args);
	}
}
