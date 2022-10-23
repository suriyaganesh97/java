package com.jpa.jpatest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.apache.logging.log4j.Logger;


@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
    static Logger logger =org.apache.logging.log4j.LogManager.getLogger((JpatestApplication.class));
    @Autowired
private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        logger.error("inside CourseJdbcRepository");
        repository.insert();
        
    }
    
}
