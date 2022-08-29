package com.suriya.first.todo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {


	@RequestMapping("/todo-list")
	public String todoList() {
		return "todo List";
}
}
