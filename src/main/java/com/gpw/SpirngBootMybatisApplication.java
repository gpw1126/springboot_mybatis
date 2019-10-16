package com.gpw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.gpw.mapper")
@SpringBootApplication
public class SpirngBootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpirngBootMybatisApplication.class, args);
	}

}
