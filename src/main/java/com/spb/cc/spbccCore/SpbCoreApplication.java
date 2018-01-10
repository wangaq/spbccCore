package com.spb.cc.spbccCore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spb.cc.spbccCore.mapper")
public class SpbCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbCoreApplication.class, args);
	}
}
