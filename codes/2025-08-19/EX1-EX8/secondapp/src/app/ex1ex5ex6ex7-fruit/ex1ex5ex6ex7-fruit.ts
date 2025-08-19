import { Component,Input,Output,EventEmitter } from '@angular/core';
interface IFruit {
  fruitCode: string;
  name: string;
  description: string;
  imageUrl: string;
}
@Component({
  selector: 'app-ex1ex5ex6ex7-fruit',
  imports: [],
  templateUrl: './ex1ex5ex6ex7-fruit.html',
  styleUrl: './ex1ex5ex6ex7-fruit.css',
  standalone: true
})
export class Ex1ex5ex6ex7Fruit {
/*  @Input() name!: string ; 
  @Input() description!: string;
  @Input() imageUrl!: string;*/
    @Input() fruit!: IFruit;
  @Output() btnClick = new EventEmitter<string>();

  remove() {
    this.btnClick.emit(this.fruit.fruitCode);
  }


}
