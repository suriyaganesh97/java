import { Component, OnInit } from '@angular/core';
import { TodoServiceService } from '../services/todo-service.service';
import { ToDoClass } from '../models/to-do-class.model';
@Component({
  selector: 'app-first-page',
  templateUrl: './first-page.component.html',
  styleUrls: ['./first-page.component.css']
})
export class FirstPageComponent implements OnInit {
  headers = ["id", "username", "description", "targetDate", "done"];
  rows;
to_do_list?:ToDoClass[];
  constructor(private todoservice: TodoServiceService) { }

  ngOnInit(): void {
    this.getToDoList();
    }
    getToDoList(){
      const data={};
      this.todoservice.getToDoList(data).subscribe({
        next: (res) => {
          console.log(res);
         this.to_do_list=res;
         this.rows=this.to_do_list;
         console.log(this.rows);
         //below line is to make sure that the object is not empty
         if(this.to_do_list){
          console.log(this.to_do_list[0].id)
          console.log(this.to_do_list[0].username)
         }
         
        },
        error: (e) => console.error(e)
      });

    }
  }

