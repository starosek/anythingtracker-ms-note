package com.anythingtracker.msnote;

import com.anythingtracker.config.ApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties({ApplicationConfig.class})
@ComponentScan(basePackages = "com.anythingtracker")
public class MsNoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsNoteApplication.class, args);
	}

}
