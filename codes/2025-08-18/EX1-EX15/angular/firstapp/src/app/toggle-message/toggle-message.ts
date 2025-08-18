import { Component } from '@angular/core';
import { CommonModule } from '@angular/common'; 
import { FormsModule } from '@angular/forms'; 
@Component({
  selector: 'app-toggle-message',
  standalone: true,   
  imports: [CommonModule,FormsModule],
  templateUrl: './toggle-message.html',
  styleUrl: './toggle-message.css'
})
export class ToggleMessage {
  showMessage: boolean = true;
  toggleVisibility():void{
    
    this.showMessage = !this.showMessage; 
    console.log('Show messages:', this.showMessage);
  }
}
