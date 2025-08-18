

import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SecondcompComponent } from './secondcomp/secondcomp'; 


@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  styleUrls: ['./app.css'],
  standalone: true,
  imports: [
    
    CommonModule,SecondcompComponent
    
  ]
})
export class AppComponent {
  title = 'my-angular-app';
  appName: string = 'my-angular-app';
  message: string ='hello i am Ramakrishna';
  changeMessage() {
    this.message = 'The message has been updated via button click!';
    console.log('Message updated by button:', this.message);
  }

  printMessageToConsole() {
    console.log('Current input textbox value (from "Print to Console" button):', this.message);
   
  }
}