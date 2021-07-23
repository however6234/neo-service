package com.viktor.learn.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@ComponentScan(basePackages = "com.viktor.learn.neo")
@ServletComponentScan
public class NeoApplication {
	public static void main(String[] args) {
		SpringApplication.run(NeoApplication.class, args);
	}
}
