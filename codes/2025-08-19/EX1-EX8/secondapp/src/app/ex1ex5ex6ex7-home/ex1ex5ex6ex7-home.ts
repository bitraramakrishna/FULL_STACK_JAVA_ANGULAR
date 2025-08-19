import { Component } from '@angular/core';
import { CommonModule } from '@angular/common'; 
import { Ex1ex5ex6ex7Fruit } from '../ex1ex5ex6ex7-fruit/ex1ex5ex6ex7-fruit';
interface IFruit {
  fruitCode: string;
  name: string;
  description: string;
  imageUrl: string;  
}

@Component({
  selector: 'app-ex1ex5ex6ex7-home',
  standalone: true,
  imports: [Ex1ex5ex6ex7Fruit,CommonModule],
  templateUrl: './ex1ex5ex6ex7-home.html',
  styleUrl: './ex1ex5ex6ex7-home.css'
})


export class Ex1ex5ex6ex7Home {

  fruitsData: IFruit[] = [
    {
      fruitCode: 'f01',
      name: 'Apple',
      description: 'A sweet red fruit that keeps doctors away.',
      imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/1/15/Red_Apple.jpg'
    },
    {
      fruitCode: 'f02',
      name: 'Banana',
      description: 'A yellow fruit, great source of potassium.',
      imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/8/8a/Banana-Single.jpg'
    },
    {
      fruitCode: 'f03',
      name: 'Mango',
      description: 'most famoue fruit',
      imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/9/90/Hapus_Mango.jpg'
    },
    {
      fruitCode: 'f04',
      name: 'Orange',
      description: 'A citrus fruit rich in vitamin C.',
      imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/c/c4/Orange-Fruit-Pieces.jpg'
    },
    {
      fruitCode: 'f05',
      name: 'Grapes',
      description: 'Small, can be green or purple.',
      imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/1/16/Table_grapes_on_white.jpg'
    },
    {
      fruitCode: 'f06',
      name: 'Pineapple',
      description: ' sweet yellow fruit.',
      imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/c/cb/Pineapple_and_cross_section.jpg'
    },
    {
      fruitCode: 'f07',
      name: 'Strawberry',
      description: 'A red,',
      imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/2/29/PerfectStrawberry.jpg'
    },
    {
      fruitCode: 'f08',
      name: 'Watermelon',
      description: 'A large, refreshing fruit with green skin and red pulp.',
      imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/f/fd/Watermelon_cross_BNC.jpg'
    }
  ];

  removeFruit(fruitCode: string) {
    this.fruitsData = this.fruitsData.filter(f => f.fruitCode !== fruitCode);
  }
}
