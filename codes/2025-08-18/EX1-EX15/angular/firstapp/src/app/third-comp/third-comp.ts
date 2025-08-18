import { Component } from '@angular/core';

@Component({
  selector: 'app-third-comp',
  imports: [],
  template: `<div class="container mt-5 p-4 bg-light rounded-lg shadow-sm">
      <h2 class="text-primary text-center mb-3">Hello from Third Component!</h2>
      <p class="text-secondary text-center">
        This component uses an <strong>inline template</strong>.
      </p>
      <button class="btn btn-info d-block mx-auto">Click Me!</button>
    </div>`,
  styleUrl: './third-comp.css'
})
export class ThirdCompComponent {

}
