package com.jpa.jpanew;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entitymanager;

    public void insert(Course course){
        entitymanager.merge(course);
    }
    
}
