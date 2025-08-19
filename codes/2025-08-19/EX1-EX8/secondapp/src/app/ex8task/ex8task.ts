import { Component,EventEmitter, Output } from '@angular/core';
import { FormsModule,NgForm } from '@angular/forms';
import { CommonModule } from '@angular/common';
interface Task {
  id: number; 
  description: string;
  category: string;
}
@Component({
  selector: 'app-ex8task',
  imports: [FormsModule,CommonModule],
  templateUrl: './ex8task.html',
  styleUrl: './ex8task.css'
})
export class Ex8task {
    description = '';
  category = 'Work';

  @Output() taskAdded = new EventEmitter<Omit<Task, 'id'>>();
  categories = ['Work', 'Study', 'Exercise', 'Other'];

  addTask(form: NgForm) {
    if (form.valid) {
      this.taskAdded.emit({
        description: this.description,
        category: this.category
      });
      form.resetForm({ category: 'Work' });
    }
  }
}
