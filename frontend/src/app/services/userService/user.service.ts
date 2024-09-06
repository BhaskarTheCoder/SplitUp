import { Injectable } from '@angular/core';
import { User } from '../../models/userModel/user';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  static currentUser: User| null = null;

  usersUrl = "http://localhost:9296"
  constructor(private _http: HttpClient) { }

  public loginUserFromRemote(userDetails: User): Observable<User> {
    const url = `${this.usersUrl}/user/login`;
    return this._http.post<any>(url, userDetails);
  }

  public registerUserFromRemote(userDetails: User): Observable<User> {
    const url = `${this.usersUrl}/user/register`;
    return this._http.post<any>(url,userDetails);
  }
}
