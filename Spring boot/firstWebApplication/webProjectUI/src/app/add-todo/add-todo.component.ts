import { Component, OnInit } from '@angular/core';
import { ToDoClass } from '../models/to-do-class.model';
import { TodoServiceService } from '../services/todo-service.service';
@Component({
  selector: 'app-add-todo',
  templateUrl: './add-todo.component.html',
  styleUrls: ['./add-todo.component.css']
})
export class AddTodoComponent implements OnInit {
// new_to_do?:ToDoClass;
to_do_list?:ToDoClass[];
new_to_do:ToDoClass={
  id:0,
  username:"",
description:"",
targetDate:"",
done:undefined
}
  constructor(private todoservice: TodoServiceService) { }

  ngOnInit(): void {

    const data={};
    this.todoservice.getToDoList(data).subscribe({
      next: (res) => {
        console.log(res);
       this.to_do_list=res;
       if(this.to_do_list){
        this.new_to_do.id=this.to_do_list[0].id+1;
       }
       
      },
      error: (e) => console.error(e)
    });
  }
  submit(){
    console.log("submit");
    console.log(this.new_to_do);
  }
}
