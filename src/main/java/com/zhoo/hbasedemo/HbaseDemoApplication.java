package com.zhoo.hbasedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan({"com.zhoo.hbasedemo.*"})
@SpringBootApplication
public class HbaseDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HbaseDemoApplication.class, args);
	}

}
