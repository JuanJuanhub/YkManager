package com.issCollege;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(basePackages = "com.issCollege.dao")
@SpringBootApplication
public class YkManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(YkManagerApplication.class, args);
	}
}
