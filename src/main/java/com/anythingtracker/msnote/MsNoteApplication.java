package com.anythingtracker.msnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.anythingtracker")
public class MsNoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsNoteApplication.class, args);
	}

}
