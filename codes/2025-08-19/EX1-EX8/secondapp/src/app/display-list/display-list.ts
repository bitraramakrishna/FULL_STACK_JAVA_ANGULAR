import { Component } from '@angular/core';
import { CommonModule } from '@angular/common'; 
@Component({
  selector: 'app-display-list',
  imports: [CommonModule],
  templateUrl: './display-list.html',
  styleUrl: './display-list.css'
})
export class DisplayList {
   fruits = [
  {
    name: 'Apple',
    description: 'The apple is a sweet, edible fruit produced by an apple tree.',
    imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/4/42/Apple_on_a_tree.jpg'
  },
  {
    name: 'Banana',
    description: 'A banana is an elongated, edible fruit – botanically a berry.',
    imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/8/8a/Banana-Single.jpg'
  },
  {
    name: 'Orange',
    description: 'An orange is a citrus fruit of various citrus species in the family Rutaceae.',
    imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/c/c4/Orange-Fruit-Pieces.jpg'
  }
];
}
