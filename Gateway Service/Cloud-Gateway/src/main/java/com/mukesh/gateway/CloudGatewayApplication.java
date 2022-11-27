package com.mukesh.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class CloudGatewayApplication {
	static Logger log = LoggerFactory.getLogger(CloudGatewayApplication.class);

	public static void main(String[] args) {
		log.info("Cloud Gateway Application Running Fine..");
		SpringApplication.run(CloudGatewayApplication.class, args);

	}

}
