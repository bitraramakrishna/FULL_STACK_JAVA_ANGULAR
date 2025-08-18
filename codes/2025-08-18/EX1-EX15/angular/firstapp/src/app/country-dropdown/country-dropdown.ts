import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms'; 
@Component({
  selector: 'app-country-dropdown',
  imports: [CommonModule,FormsModule],
  templateUrl: './country-dropdown.html',
  styleUrl: './country-dropdown.css'
})
export class CountryDropdown {
  private allCountries: string[] = [
    
    'Egypt', 'Nigeria', 'Kenya', 'New Zealand', 'Sweden', 'Norway'
  ];
  availableCountries: string[] = [];

  
  selectedCountry: string = '';


  loadCountries(): void {
   
    this.availableCountries = [...this.allCountries];
    
    if (this.availableCountries.length > 0) {
      this.selectedCountry = this.availableCountries[0];
    }
    console.log('Countries loaded into dropdown:', this.availableCountries);
  }
}
