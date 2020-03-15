package com.unique.volunteer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.unique.volunteer.mapper")
public class VolunteerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VolunteerApplication.class, args);
	}

}
