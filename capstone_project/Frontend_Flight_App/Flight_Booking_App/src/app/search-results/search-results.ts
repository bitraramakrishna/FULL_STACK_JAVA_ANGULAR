
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FlightDTO } from '../entity/flight';
import { Booking } from '../booking';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-search-results',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './search-results.html',
  styleUrl: './search-results.css'
})
export class SearchResults {
  flights: FlightDTO[] = [];
  filteredFlights: FlightDTO[] = [];
  airlines = ["Boeing", "Indigo", "Air India", "SpiceJet", "GoAir"];
  selectedAirlines: string[] = [];

  constructor(private bookingService: Booking, private router: Router) {
    const search = history.state;
    if (search.source && search.destination && search.date) {
      bookingService.searchFlights(search).subscribe(data => {
        
        this.flights = data.map(flight => {
          const startDate = new Date(flight.startDate);

          
          const startHour = 6 + Math.floor(Math.random() * 12);
          
          const startMinute = Math.random() > 0.5 ? 0 : 30;
          startDate.setHours(startHour, startMinute, 0, 0);

          
          const durationHours = 2 + Math.floor(Math.random() * 4);
          const endDate = new Date(startDate.getTime() + durationHours * 60 * 60 * 1000);

          return {
            ...flight,
            startDate: startDate,
            endDate: endDate
          };
        });

        this.filteredFlights = this.flights;
      });
    }
  }

  book(flightId: string) {
    this.router.navigate(['/booking', flightId]);
  }

  applyFilters() {
    this.filteredFlights = this.flights.filter(f =>
      this.selectedAirlines.length === 0 || this.selectedAirlines.includes(f.airline)
    );
  }

  onAirlineFilterChange(event: any, airline: string) {
    if (event.target.checked) {
      this.selectedAirlines.push(airline);
    } else {
      this.selectedAirlines = this.selectedAirlines.filter(a => a !== airline);
    }
    this.applyFilters();
  }

  getDuration(start: string | Date, end: string | Date): string {
    const startDate = new Date(start);
    const endDate = new Date(end);

    const diffMs = endDate.getTime() - startDate.getTime();
    const diffMinutes = Math.floor(diffMs / (1000 * 60));
    const hours = Math.floor(diffMinutes / 60);
    const minutes = diffMinutes % 60;

    if (hours > 0 && minutes > 0) {
      return `${hours}h ${minutes}m`;
    } else if (hours > 0) {
      return `${hours}h`;
    } else {
      return `${minutes}m`;
    }
  }
}
