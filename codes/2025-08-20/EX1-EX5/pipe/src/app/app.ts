import { Component, signal } from '@angular/core';
//import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
//import { UpperCasePipe } from '@angular/common';
//import { Ex2calendar } from './ex2calendar/ex2calendar';
//import {Ex3ctofPipe } from './ex3ctof-pipe'
import { CommonModule } from '@angular/common';   
//import { Ex4highlightstrikethru } from './ex4highlightstrikethru';
import { Ex5Movielist } from './ex5-movielist/ex5-movielist';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule,FormsModule,Ex5Movielist/*,Ex4highlightstrikethru/*,Ex3ctofPipe,FormsModule,UpperCasePipe,Ex2calendar*/],
   templateUrl:'./app.html',/* `<app-ex2calendar></app-ex2calendar>`*/
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('pipe');
  //inputText : string='';
 //ex3 celsius: number | null = null;
// name:string='';
}
