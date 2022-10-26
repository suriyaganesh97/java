package com.jpa.jpanew;

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
        logger.debug("inside CourseJdbcRepository");
        repository.insert(new Course(1, "java now", "suriya"));
        repository.insert(new Course(2, "spring boot", "suriya"));
        repository.insert(new Course(3, "JPA", "suriya"));
        repository.delete(3);
        System.out.println(repository.selectWithId(2)); 
    }
    
}
