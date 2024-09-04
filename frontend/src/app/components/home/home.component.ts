import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/userService/user.service';
import { User } from '../../models/userModel/user';

@Component({
  selector: "app-home",
  templateUrl: "./home.component.html",
  styleUrl: "./home.component.scss",
})
export class HomeComponent{
  constructor(private _userService: UserService) {}
  currentUser = new User();

  ngOnInit(): void {
    this.currentUser = this._userService.getUser();
    console.log(this.currentUser.name);
  }
}
