import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms'; 
import { LoginServiceService } from '../services/login-service.service';
import { User } from '../models/user.model';
@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {
  loginUserId:String='';
  Password:String='';
  submitted = false;
  user:User = {
    name:'',
    password:''
  }
  constructor(private loginService: LoginServiceService ) { }

  ngOnInit(): void {

  }
  logIn():void{
    console.log(this.loginUserId);
    const data={
      name:this.loginUserId,
      password:this.Password
    }
    this.loginService.login(data)
    .subscribe({
      next: (res) => {
        console.log(res);
        this.submitted = true;
      },
      error: (e) => console.error(e)
    });
  }

}
