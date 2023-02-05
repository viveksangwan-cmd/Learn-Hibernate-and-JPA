package com.viveksangwan.database.databasedemo.jbdc;

import com.viveksangwan.database.databasedemo.PersonService;
import com.viveksangwan.database.databasedemo.jbdc.models.Person;
import com.viveksangwan.database.databasedemo.jbdc.repository.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JdbcDemo implements PersonService {
    private Logger logger =  LoggerFactory.getLogger(this.getClass());
    @Autowired
    PersonJdbcDao personJdbcDao;
    public void run() {
        logger.info("All users -> {}",personJdbcDao.findAllPerson());
        logger.info("Find specific user by id -> {}",personJdbcDao.findById(1001));
        logger.info("Delete specific user by id -> Number of users affected by the operation -> {}",personJdbcDao.deleteById(1002));
        logger.info("Delete operation with multiple conditions, rows affected by the operation -> {}",personJdbcDao.deleteByNameAndLocation("OPQ","LONDON"));
        Person person = new Person(1006,"WASD","Paris",new Date());
        logger.info("Insert a new person, rows affected by the operation -> {}",personJdbcDao.insert(person));
        person.setId(1004); // Updating id so we can just for Learning :)
        logger.info("Update a person, rows affected by the operation -> {}",personJdbcDao.update(person));
        logger.info("All users -> {}",personJdbcDao.findAllPerson());
    }
}