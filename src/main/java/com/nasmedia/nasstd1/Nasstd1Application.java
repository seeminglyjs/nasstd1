package com.nasmedia.nasstd1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class }) //데이터베이스 사용안함
public class Nasstd1Application {

	public static void main(String[] args) {
		SpringApplication.run(Nasstd1Application.class, args);
	}

}
