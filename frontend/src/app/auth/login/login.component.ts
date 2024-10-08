import { Component } from '@angular/core';
import {FormControl, FormGroup, ReactiveFormsModule, Validators} from "@angular/forms";
import {TranslocoPipe} from "@jsverse/transloco";

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [
    ReactiveFormsModule,
    TranslocoPipe
  ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {
  formValidation: boolean = false;
  loginForm: FormGroup<{
    usernameOrEmail: FormControl<string | null>;
    password: FormControl<string | null>;
  }>;

  constructor() {
    this.loginForm = new FormGroup({
      usernameOrEmail: new FormControl('', [Validators.required]),
      password: new FormControl('', [Validators.required])
    });
  }

  onSubmit() {
    this.formValidation = true;
    if (this.loginForm.valid) {
      console.log(this.loginForm.value);
    }
  }
}
