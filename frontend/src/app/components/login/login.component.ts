import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from '../../models/userModel/user';
import { UserService } from '../../services/userService/user.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent  {
  

  constructor(
    private _router: Router,
    private _userService: UserService
  ) {}

  user = new User();
  loginUser(userDetails: User){
    this._userService.loginUserFromRemote(userDetails).subscribe(
      (data) => {
        console.log("LoggedIn:"+ data);
        this._router.navigate(["/home"]);
        UserService.currentUser = data;
      },
      (error) => {
        console.log("Exception Occured:" + error);
      }
    );
  }
  onSubmit(form: NgForm) {
    console.log(form.value); // Access form data
     this.user.email = form.value.email;
     this.user.password = form.value.password;
     this.loginUser(this.user)
  }
  
}