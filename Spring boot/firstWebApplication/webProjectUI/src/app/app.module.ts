import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { Routes,RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms'; 
import { HttpClientModule } from '@angular/common/http';
import { AddTodoComponent } from './add-todo/add-todo.component';
import { FirstPageComponent } from './first-page/first-page.component';
const appRoutes: Routes = [
  {path:'', component: LoginPageComponent},
  {path:'add-todo', component: AddTodoComponent},
  {path:'first-page', component: FirstPageComponent}
];
@NgModule({
  declarations: [
    AppComponent,
    LoginPageComponent,
    AddTodoComponent,
    FirstPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes),
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
