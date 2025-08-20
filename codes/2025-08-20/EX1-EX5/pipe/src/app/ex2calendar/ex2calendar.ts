import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { DatePipe } from '@angular/common';
@Component({
  selector: 'app-ex2calendar',
  imports: [FormsModule,DatePipe],
  templateUrl: './ex2calendar.html',
  styleUrl: './ex2calendar.css'
})
export class Ex2calendar {
  selDate:string='';
}
