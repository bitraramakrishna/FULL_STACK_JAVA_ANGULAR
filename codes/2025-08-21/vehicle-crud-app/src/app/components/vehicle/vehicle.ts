import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { VehicleService } from '../../services/vehicle.services';
import { Vehicle } from '../../models/vehicle.interface';

@Component({
  selector: 'app-vehicle',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './vehicle.html',
  styleUrls: ['./vehicle.css']
})
export class VehicleComponent implements OnInit {
  vehicles: Vehicle[] = [];
  selectedVehicle: Vehicle | null = null;
  isEditing: boolean = false;
  newVehicle: Vehicle = {
    make: '',
    model: '',
    fuelType: '',
    price: 0
  };

  constructor(private vehicleService: VehicleService) { }

  ngOnInit(): void {
    this.loadVehicles();
  }

  loadVehicles(): void {
    this.vehicleService.getAllVehicles().subscribe({
      next: (vehicles) => {
        this.vehicles = vehicles;
      },
      error: (error) => {
        console.error('Error loading vehicles:', error);
      }
    });
  }

  onSubmit(): void {
    if (this.isEditing && this.selectedVehicle) {
      this.updateVehicle();
    } else {
      this.createVehicle();
    }
  }

  createVehicle(): void {
    if (this.isValidVehicle(this.newVehicle)) {
      this.vehicleService.createVehicle(this.newVehicle).subscribe({
        next: (vehicle) => {
          this.vehicles.push(vehicle);
          this.resetForm();
        },
        error: (error) => {
          console.error('Error creating vehicle:', error);
        }
      });
    }
  }

  editVehicle(vehicle: Vehicle): void {
    this.selectedVehicle = { ...vehicle };
    this.newVehicle = { ...vehicle };
    this.isEditing = true;
  }

  updateVehicle(): void {
    if (this.selectedVehicle && this.isValidVehicle(this.newVehicle)) {
      this.vehicleService.updateVehicle(this.selectedVehicle.id!, this.newVehicle).subscribe({
        next: (updatedVehicle) => {
          const index = this.vehicles.findIndex(v => v.id === updatedVehicle.id);
          if (index !== -1) {
            this.vehicles[index] = updatedVehicle;
          }
          this.resetForm();
        },
        error: (error) => {
          console.error('Error updating vehicle:', error);
        }
      });
    }
  }

  deleteVehicle(id: number): void {
    if (confirm('Are you sure you want to delete this vehicle?')) {
      this.vehicleService.deleteVehicle(id).subscribe({
        next: () => {
          this.vehicles = this.vehicles.filter(v => v.id !== id);
        },
        error: (error) => {
          console.error('Error deleting vehicle:', error);
        }
      });
    }
  }

  resetForm(): void {
    this.newVehicle = {
      make: '',
      model: '',
      fuelType: '',
      price: 0
    };
    this.selectedVehicle = null;
    this.isEditing = false;
  }

  private isValidVehicle(vehicle: Vehicle): boolean {
    return vehicle.make.trim() !== '' && 
           vehicle.model.trim() !== '' && 
           vehicle.fuelType.trim() !== '' && 
           vehicle.price > 0;
  }
}