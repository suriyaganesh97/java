package com.jpa.jpatest;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class CourseJdbcRepository {
    static Logger logger =org.apache.logging.log4j.LogManager.getLogger((JpatestApplication.class));
    @Autowired
    private JdbcTemplate springjdbctemplate;
    
    private static String INSERT_QUERY=
    "insert into course(id,name,author) values(?,?,?);";

    private static String DELETE_QUERY=
    "delete from course where id=?;";

    private static String SELECT_QUERY_WITH_ID=
    "select * from course where id=?;";


    public void insert(Course course){
        logger.debug("inside insert method");
        logger.debug("printing insert query value"+INSERT_QUERY);
        springjdbctemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public void delete(int id){
        logger.debug("inside delete method");
        logger.debug("printing delete query value"+DELETE_QUERY);
        springjdbctemplate.update(DELETE_QUERY,id);
    }

    public Course selectWithId(int id){
        logger.debug("inside select with id method");
        logger.debug("printing select query value with id"+SELECT_QUERY_WITH_ID);
        return springjdbctemplate.queryForObject(SELECT_QUERY_WITH_ID, new BeanPropertyRowMapper<>(Course.class),id);
    }
}
