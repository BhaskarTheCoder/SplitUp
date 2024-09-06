import { Component } from '@angular/core';
import { UserService } from '../../services/userService/user.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
  signUp = "";
  login = ""
  user ="";
  constructor(){
    if(UserService.currentUser == null){
      this.signUp = "Register";
      this.login = "Login";
    }
    else 
    {
        this.user = "Welcome " + (UserService.currentUser.name);
    }
  }
  

}
