import { Component } from '@angular/core';
import { DisplayList } from '../display-list/display-list'; 
import { CommonModule } from '@angular/common';
//import { Ex2ngclass } from '../ex2ngclass/ex2ngclass';
@Component({
  selector: 'app-home',
  imports: [DisplayList,CommonModule],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
  
}
