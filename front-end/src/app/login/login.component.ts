

import {Component, OnInit} from '@angular/core';
import {FormGroup, FormBuilder} from '@angular/forms';
import {Router} from '@angular/router';
import {AuthService} from "../services/auth.service";
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm!: FormGroup;
  roles!: string | null;
  constructor(private authService: AuthService, private formBuilder: FormBuilder, private router: Router) {
  }
  ngOnInit() {
    this.loginForm = this.formBuilder.group({
      username: [''],
      password: ['']
    });
  }
  get f() {
    return this.loginForm.controls;
  }
  login() {
    this.authService.login(
      {
        username: this.f['username'   ].value,
        password: this.f['password'].value
      }
    )
      // .subscribe(success => {
      //   if (success) {
      //     if (localStorage.getItem("ROLES")!.includes("ADMIN")) {
      //       this.router.navigate(['/navbar/acceuil']);
      //       document.location.reload();
      //     } else {
      //       this.router.navigate(["/navbar/acceuil"]);
      //       setTimeout(function () {
      //         document.location.reload();
      //       }, 1000);    
      //     }
      //   }
      // });


      //Token needed to know the role 
      .subscribe(success => {
        if (success) {
          this.router.navigate(['/dashboard']);
               if (localStorage.getItem("ROLES")!.includes("ETUDIANTS")) {
                 this.router.navigate(['/etudiant']);
                 
               } else {
                 this.router.navigate(["/dashboard"]);
               }
              }
      });
  }
}



