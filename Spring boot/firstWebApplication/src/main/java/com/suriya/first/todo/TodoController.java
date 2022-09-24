package com.suriya.first.todo;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodoController {

public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
private TodoService todoService;

@RequestMapping("/todo-list")
	public List<Todo> todoList() {
		return todoService.findByUserName("suriya");
}

@RequestMapping("/add-todo")
	public List<Todo> addTodo() {
		return todoService.findByUserName("suriya");
}
}
