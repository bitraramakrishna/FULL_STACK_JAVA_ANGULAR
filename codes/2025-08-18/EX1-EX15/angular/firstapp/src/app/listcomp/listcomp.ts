import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-listcomp',
  imports: [CommonModule],
  templateUrl: './listcomp.html',
  styleUrl: './listcomp.css'
})
export class Listcomp {
  names: string[] = ['ram', 'krishna', 'prasad', 'dhoni'];
}
