import { Component } from '@angular/core';
import { CommonModule } from '@angular/common'; 

@Component({
  selector: 'app-ex15-home',
  imports: [CommonModule],
  templateUrl: './ex15-home.html',
  styleUrl: './ex15-home.css'
})

export class EX15Home {
   books: any[] = [];
constructor() {
  for (let i = 1; i <= 20; i++) {
    this.books.push({
      title: `Book Title ${i}`,
      description: `This is a short description for Book ${i}.`,
      image: `https://picsum.photos/200/300?random=${i}`
    });
  }
}

}
