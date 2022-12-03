package com.springdatajpa.springdatajpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

@Id    
private int id;
private String name;
private String author;
//has getters,setters and two constructors
public Course() {
}
public Course(int id, String name, String author) {
    this.id = id;
    this.name = name;
    this.author = author;
}
@Override
public String toString() {
    return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
}
public int getId() {
    return id;
}
public String getName() {
    return name;
}
public String getAuthor() {
    return author;
}
public void setId(int id) {
    this.id = id;
}
public void setName(String name) {
    this.name = name;
}
public void setAuthor(String author) {
    this.author = author;
}

}
