package com.viveksangwan.database.databasedemo.jpa;

import com.viveksangwan.database.databasedemo.PersonService;
import com.viveksangwan.database.databasedemo.jbdc.models.Person;
import com.viveksangwan.database.databasedemo.jpa.Entity.PersonJPA;
import com.viveksangwan.database.databasedemo.jpa.repository.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Primary
public class JpaDemo implements PersonService {
    private Logger logger =  LoggerFactory.getLogger(this.getClass());
    private static List<PersonJPA> data;

    static {
        data = new ArrayList<PersonJPA>(){};
        data.add(new PersonJPA("XYZ","MUMBAI",new Date()));
        data.add(new PersonJPA("ABC","DELHI",new Date()));
        data.add(new PersonJPA("OPQ","CHICAGO",new Date()));
        data.add(new PersonJPA("TUV","TOKYO",new Date()));
        data.add(new PersonJPA("LMN","PARIS",new Date()));
    }
    @Autowired
    PersonJpaRepository personJpaRepository;

    public void run() {
        for(PersonJPA person : data){
            personJpaRepository.insert(person);
        }
        PersonJPA person = new PersonJPA(2,"ABC","HONG KONG",new Date());
        logger.info("All users -> {}",personJpaRepository.findAllPerson());
        logger.info("Find specific user by id -> {}",personJpaRepository.findById(1));
        personJpaRepository.deleteById(2);
        personJpaRepository.deleteByNameAndLocation("OPQ","LONDON");
        logger.info("Update a person, rows affected by the operation -> {}",personJpaRepository.update(person));
        logger.info("All users -> {}",personJpaRepository.findAllPerson());
    }
}
