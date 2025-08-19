import { Component } from '@angular/core';
import { Ex8task } from '../ex8task/ex8task';
import { Ex8tasklist } from '../ex8tasklist/ex8tasklist';
import { FormsModule } from '@angular/forms';

interface Task {
  id: number;
  description: string;
  category: string;
}
@Component({
  selector: 'app-ex8home',
  imports: [Ex8task,Ex8tasklist,FormsModule],
  templateUrl: './ex8home.html',
  styleUrl: './ex8home.css'
})
export class Ex8home {
   tasks: Task[] = [];
   private currentId = 1;

  
  addTask(task: Omit<Task, 'id'>) {
    const newTask: Task = { id: this.currentId++, ...task }; 
    this.tasks.push(newTask);
  }

  
  deleteTask(id: number) {
    this.tasks = this.tasks.filter(task => task.id !== id);
  }
}
