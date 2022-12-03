package com.springdatajpa.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Integer>{
    List<Course> findByAuthor(String Author);
    List<Course> findByName(String Name);
}
