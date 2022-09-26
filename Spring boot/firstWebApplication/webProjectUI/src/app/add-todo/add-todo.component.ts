import { Component, OnInit } from '@angular/core';
import { ToDoClass } from '../models/to-do-class.model';
import { TodoServiceService } from '../services/todo-service.service';
import { Router } from "@angular/router";
@Component({
  selector: 'app-add-todo',
  templateUrl: './add-todo.component.html',
  styleUrls: ['./add-todo.component.css']
})
export class AddTodoComponent implements OnInit {

to_do_list?:ToDoClass[];

todo:ToDoClass={
  id:0,
  username:"",
description:"",
targetDate:"",
done:undefined
}
  constructor(private todoservice: TodoServiceService,public router: Router) { }

  ngOnInit(): void {
  }
  submit(){
    console.log(this.todo);
    const data={
      id:0,
      username:this.todo.username,
      description:this.todo.description,
      targetDate:this.todo.targetDate,
      done:false
    };
    console.log(data);
    this.todoservice.addTodo(data).subscribe({
      next: (res) => {
        console.log(res);
        this.router.navigate(["/first-page"]);
      },
      error: (e) => console.error(e)
    });
  }
}
