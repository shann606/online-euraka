package com.ecom.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class OnlineEurakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineEurakaApplication.class, args);
	}

}
