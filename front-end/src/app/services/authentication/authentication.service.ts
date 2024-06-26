import {Injectable} from '@angular/core';
import {AppUser} from "../../model/user.model";
// @ts-ignore
import {Observable, of, throwError} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {
  users: AppUser[] = [];
  authenticatedUser: AppUser | undefined;

  constructor() {
  }

  public login(username: string): Observable<AppUser> {
    let appUser = this.users.find(u => u.username == username);
    if (!appUser) return throwError(() => new Error("User not found"));
    return of(appUser);
  }

  public authenticateUser(appUser: AppUser): Observable<boolean> {
    this.authenticatedUser = appUser;
    localStorage.setItem("authUser", JSON.stringify({
      username: appUser.username,
      jwt: "JWT_TOKEN"
    }))
    return of(true);
  }

  public isAuthenticated(){
    return this.authenticatedUser!=undefined;
  }

  public logout(): Observable<boolean>{
    this.authenticatedUser=undefined;
    localStorage.removeItem("authUser");
    return of(true);
  }
}
