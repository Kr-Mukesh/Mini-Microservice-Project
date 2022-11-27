package com.mukesh.Cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class CloudConfigServerApplication {

	static Logger log = LoggerFactory.getLogger(CloudConfigServerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerApplication.class, args);

		log.info("Cloud Config Server Application Running Fine");
	}

}
