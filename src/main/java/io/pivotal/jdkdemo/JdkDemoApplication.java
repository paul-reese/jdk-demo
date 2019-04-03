package io.pivotal.jdkdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.management.MXBean;

@SpringBootApplication
public class JdkDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdkDemoApplication.class, args);
	}

}
