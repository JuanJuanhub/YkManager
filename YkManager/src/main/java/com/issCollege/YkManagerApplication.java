package com.issCollege;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(value="classpath:com.issCollege.mapper")
@SpringBootApplication
public class YkManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(YkManagerApplication.class, args);
	}
}
