package com.java.learn.HelloSpringBoot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan(value = "com.java.learn.HelloSpringBoot.dao")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("程序正在运行");
	}
}
