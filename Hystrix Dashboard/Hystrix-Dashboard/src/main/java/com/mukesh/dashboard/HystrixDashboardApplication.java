package com.mukesh.dashboard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
public class HystrixDashboardApplication {

	static Logger log = LoggerFactory.getLogger(HystrixDashboardApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApplication.class, args);

		log.info("Hystrix Dashboard Application Running Fine..");
	}


}
