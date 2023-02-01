package com.viveksangwan.database.databasedemo;

import com.viveksangwan.database.databasedemo.jbdc.JdbcDemo;
import com.viveksangwan.database.databasedemo.jbdc.models.Person;
import com.viveksangwan.database.databasedemo.jbdc.repository.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
