package com.suriya.first.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static int toDoCount=0;
private static List<Todo> todos = new ArrayList<>();
static {
	todos.add(new Todo(++toDoCount,"suriya","Spring Boot",LocalDate.now().plusYears(1),false));
	todos.add(new Todo(++toDoCount,"ragu","JPA",LocalDate.now().plusYears(1),false));
	todos.add(new Todo(++toDoCount,"ganesh","Docker",LocalDate.now().plusYears(1),false));
}

//finding by the ID
public Todo findById(int id){
	int j=0;
	for(int i=0;i<todos.size();i++){
		if(todos.get(i).getId()==id){
			j=i;
		}
	}
	return todos.get(j);
}
public List<Todo> allToDos(){
	return todos;
}
public void addTodo(String username, String description, LocalDate targetDate, boolean done){
++toDoCount;
Todo todo = new Todo(toDoCount,username,description,targetDate,done);
todos.add(todo);
System.out.println(todos);
}

public void deleteTodo(int id){
int j=0;
for(int i=0;i<todos.size();i++){
	if(todos.get(i).getId()==id){
		j=i;
	}
}
todos.remove(j);
}
}
