package com.neusoft;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableConfigServer		//启用springcloud config服务端（注解）
public class MyApplication {

	
	public static void main(String args[]) {
		SpringApplication.run(MyApplication.class, args);
	}
}
