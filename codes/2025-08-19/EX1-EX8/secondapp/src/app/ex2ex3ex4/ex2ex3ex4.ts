import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-ex2ex3ex4',
  standalone: true,  
  imports: [CommonModule],
  templateUrl: './ex2ex3ex4.html',
  styleUrl: './ex2ex3ex4.css'
})
export class Ex2ex3ex4 {
  //ex2
  stringClass = 'text-red';  
  arrayClass = ['big-text', 'bold-text']; 
  objectClass = { 'bg-yellow': true, 'italic-text': true }; 

  //ex3
  getNgClass() {
    return {
      'box': true,
      'highlight': true
    };
  }

  //ex4
  myStyle = {
    'color': 'white',
    'background-color': 'blue',
    'padding': '10px',
    'border-radius': '5px'
  };
}