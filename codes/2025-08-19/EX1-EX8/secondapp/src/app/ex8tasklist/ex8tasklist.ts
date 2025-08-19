import { Component, EventEmitter, Input, Output } from '@angular/core';
import { CommonModule } from '@angular/common';
interface Task {
  id: number; 
  description: string;
  category: string;
}
@Component({
  selector: 'app-ex8tasklist',
  imports: [CommonModule],
  templateUrl: './ex8tasklist.html',
  styleUrl: './ex8tasklist.css'
})
export class Ex8tasklist {
     @Input() tasks: Task[] = [];
  @Output() taskDeleted = new EventEmitter<number>();

  deleteTask(id: number) {
    this.taskDeleted.emit(id);
  }
}
