package com.jpa.jpanew;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entitymanager;

    public void insert(Course course){
        entitymanager.merge(course);
    }

    public Course selectWithId(int id){
        return entitymanager.find(Course.class, id);
    }

    public void deleteById(int id){
        Course course=entitymanager.find(Course.class, id);
        entitymanager.remove(course);
    }
    
}
