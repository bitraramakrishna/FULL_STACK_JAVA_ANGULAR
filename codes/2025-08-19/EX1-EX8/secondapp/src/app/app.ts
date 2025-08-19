import { Component } from '@angular/core';
//import { RouterOutlet } from '@angular/router';
import { Ex1ex5ex6ex7Home } from './ex1ex5ex6ex7-home/ex1ex5ex6ex7-home';  
@Component({
  selector: 'app-root',
  imports: [Ex1ex5ex6ex7Home],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  title = 'Ex5FruitApp';
}
