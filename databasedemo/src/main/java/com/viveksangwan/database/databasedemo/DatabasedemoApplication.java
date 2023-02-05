package com.viveksangwan.database.databasedemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DatabasedemoApplication implements CommandLineRunner {
	@Autowired()
	private PersonService personService;
	public static void main(String[] args) {
		SpringApplication.run(DatabasedemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		personService.run();
	}
}
