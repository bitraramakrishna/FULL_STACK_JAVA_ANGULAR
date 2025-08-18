import { Component } from '@angular/core';
import { CommonModule } from '@angular/common'; 
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, 
    FormsModule],
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class Login {
  username: string = '';
  password: string = '';

  onLogin() {
    console.log('Login attempt:', { username: this.username, password: this.password });
    
    alert(`Login attempted for user: ${this.username}`); 
  }

}
