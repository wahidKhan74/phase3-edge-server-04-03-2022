package com.simplilearn.edgeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Phase3EdgeServer04032022Application {

	public static void main(String[] args) {
		SpringApplication.run(Phase3EdgeServer04032022Application.class, args);
	}

}
