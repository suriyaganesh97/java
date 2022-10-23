package com.jpa;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jpa.jpatest.JpatestApplication;


@Repository
public class CourseJdbcRepository {
    static Logger logger =org.apache.logging.log4j.LogManager.getLogger((JpatestApplication.class));
    @Autowired
    private JdbcTemplate springjdbctemplate;
    
    private static String INSERT_QUERY=
    "insert into course(id,name,author) values(1,'learn java','suriya');";
    public void insert(){
        logger.error("inside insert method");
        logger.error("printing insert query value"+INSERT_QUERY);
        springjdbctemplate.update(INSERT_QUERY);
    }
}
