package com.springdatajpa.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.apache.logging.log4j.Logger;


@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
    static Logger logger =org.apache.logging.log4j.LogManager.getLogger((SpringdatajpaApplication.class));
@Autowired
private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        logger.debug("inside CourseJdbcRepository");
        repository.save(new Course(1, "java now", "suriya"));
        repository.save(new Course(2, "spring boot", "ganesh"));
        repository.save(new Course(3, "JPA", "suriya"));
         System.out.println(repository.findById(2)); 
        repository.deleteById(3);
        repository.findAll();
        System.out.println(repository.findByAuthor("suriya"));// will query with author name  like select query with name
        System.out.println(repository.findByAuthor("ganesh"));
        System.out.println(repository.findByName("spring boot"));
        
    }
    
}
