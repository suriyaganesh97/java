import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
const baseUrl = 'http://localhost:8080';
@Injectable({
  providedIn: 'root'
})

export class TodoServiceService {

  constructor(private http: HttpClient) { }
  getToDoList(params: any): Observable<any> {
    return this.http.get<any>(`${baseUrl}/todo-list`, { params });
  }
  addTodo(data:any):Observable<any>{
    return this.http.post(`${baseUrl}/add-todo`,data)
  }
}
