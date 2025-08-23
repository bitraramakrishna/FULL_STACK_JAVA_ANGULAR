import { Component } from '@angular/core';
import { VehicleComponent } from './components/vehicle/vehicle';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [VehicleComponent],
  templateUrl: `./app.html`,
  styleUrls: ['./app.css']
})
export class AppComponent {
  title = 'vehicle-crud-app';
}