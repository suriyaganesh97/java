package com.suriya.first.todo;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		return todoService.allToDos();
}

//getting the id as req param and fetching its todo data
@RequestMapping("/todo-list/{id}")
	public Todo toDoListWithId(@RequestParam int id) {
		return todoService.findById(id);
}

//POST method to add ToDo
@RequestMapping(method=RequestMethod.POST,value="/add-todo")
	public List<Todo> addTodo(@RequestBody Todo todo) {
		todoService.addTodo(todo.getUsername(), todo.getDescription(),todo.getTargetDate(),false);
		return todoService.allToDos();
}

//delete method with id, note that URL is same the request method is delete
@RequestMapping(method=RequestMethod.DELETE,value="/todo-list/{id}")
	public void deleteTodo(@RequestParam int id) {
		todoService.deleteTodo(id);
}

}
