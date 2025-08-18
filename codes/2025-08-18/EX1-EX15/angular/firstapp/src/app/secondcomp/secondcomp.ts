import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-secondcomp',
  imports: [CommonModule],
  templateUrl: './secondcomp.html',
  styleUrl: './secondcomp.css'
})
export class  SecondcompComponent{
 message = "Hello from the **Second Component**!";
}
