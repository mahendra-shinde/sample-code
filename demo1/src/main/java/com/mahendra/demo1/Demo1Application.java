package com.mahendra.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {
	static double pi = 3.14;
	int is_done = false;

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
