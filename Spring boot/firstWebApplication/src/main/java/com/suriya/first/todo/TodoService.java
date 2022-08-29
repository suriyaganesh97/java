package com.suriya.first.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
private static List<Todo> todos;
static {
	todos.add(new Todo(1,"suriya","Spring Boot",LocalDate.now().plusYears(1),false));
	todos.add(new Todo(2,"suriya","JPA",LocalDate.now().plusYears(1),false));
	todos.add(new Todo(3,"suriya","Docker",LocalDate.now().plusYears(1),false));
}

public List<Todo> findByUserName(String userName){
	return todos;
}
}
