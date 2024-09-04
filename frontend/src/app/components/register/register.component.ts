import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from '../../models/userModel/user';
import { UserService } from '../../services/userService/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent {
  constructor(
    private _router: Router,
    private _userService: UserService
  ) {}

  user = new User();
  errorMsg = "";
  registerUser(userDetails: User){
    this._userService.registerUserFromRemote(userDetails).subscribe(
      (data) => {
        console.log("You have registered successfully!:"+ data);
        this._router.navigate(["/login"]);
      },
      (error) => {
        console.log("Exception Occured:" + error);
        if (error.status === 500) {
          this.errorMsg = "Email ID already exists"
          console.log('Email ID already exists', error.message);
        }
      }
    );
  }
  onSubmit(form: NgForm) {
    console.log(form.value); // Access form data
     this.user.name = form.value.name;
     this.user.email = form.value.email;
     this.user.password = form.value.password;
     this.registerUser(this.user)
  }

}
