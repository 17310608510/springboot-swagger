package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
@EnableSwaggerBootstrapUI
@SpringBootApplication
public class SpringbootSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSwaggerApplication.class, args);
	}

}
