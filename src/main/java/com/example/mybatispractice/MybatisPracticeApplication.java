package com.example.mybatispractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisPracticeApplication {

	public static void main(String[] args) {
		try {
			System.out.println("-> " + Class.forName("org.mariadb.jdbc.Driver"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		SpringApplication.run(MybatisPracticeApplication.class, args);
	}

}
