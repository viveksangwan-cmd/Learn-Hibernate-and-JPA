package com.viveksangwan.database.databasedemo.jpa;

import com.viveksangwan.database.databasedemo.PersonService;
import com.viveksangwan.database.databasedemo.jbdc.repository.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class JpaDemo implements PersonService {
    private Logger logger =  LoggerFactory.getLogger(this.getClass());
    @Autowired
    PersonJdbcDao personJdbcDao;

    public void run(){
        System.out.println("Hello");
    }

}
