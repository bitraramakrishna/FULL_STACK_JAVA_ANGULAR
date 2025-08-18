import { Component } from '@angular/core';
import { CommonModule } from '@angular/common'; 
import { FormsModule } from '@angular/forms';  
@Component({
  selector: 'app-color-change',
  imports: [CommonModule,FormsModule],
  templateUrl: './color-change.html',
  styleUrl: './color-change.css'
})
export class ColorChange {
  colors: string[] = ['red', 'green', 'blue', 'purple'];
  selectedColor: string = 'red';
}
