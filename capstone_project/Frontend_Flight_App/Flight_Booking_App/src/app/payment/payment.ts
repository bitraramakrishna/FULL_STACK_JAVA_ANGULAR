/*import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Booking } from '../booking';
import { BookingRequest } from '../models/booking-request.dto';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-payment',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './payment.html',
  styleUrl: './payment.css'
})
export class Payment {
  bookingId!: string;
  mode: string = 'CARD';
  constructor(private route: ActivatedRoute,private bookingService: Booking,private router: Router) {
    this.bookingId = this.route.snapshot.params['bookingId'];
  }
  simulatePayment(){
    setTimeout(() => {
      this.bookingService.getBookingStatus(this.bookingId).subscribe((res:any) => {
        if(res.status === 'Successful'){
          this.router.navigate(['/success',this.bookingId]);
        } else {
          this.router.navigate(['/failure']);
        }
      });
    }, 3000);
  }

}
*/

import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Booking } from '../booking';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-payment',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './payment.html',
  styleUrls: ['./payment.css']
})
export class Payment {
  bookingId!: string;
  mode: string = 'CARD';

  // extra fields for card payment
  cardNumber: string = '';
  cardHolder: string = '';
  expiry: string = '';
  cvv: string = '';

  constructor(private route: ActivatedRoute, private bookingService: Booking, private router: Router) {
    this.bookingId = this.route.snapshot.params['bookingId'];
  }

  // simple card validation
  isCardValid(): boolean {
    return (
      this.cardNumber.replace(/\s+/g, '').match(/^\d{16}$/) !== null &&
      this.cardHolder.trim().length > 2 &&
      this.expiry.match(/^(0[1-9]|1[0-2])\/\d{2}$/) !== null &&
      this.cvv.match(/^\d{3}$/) !== null
    );
  }

  simulatePayment() {
    setTimeout(() => {
      this.bookingService.getBookingStatus(this.bookingId).subscribe((res: any) => {
        if (res.status === 'Successful') {
          this.router.navigate(['/success', this.bookingId]);
        } else {
          this.router.navigate(['/failure']);
        }
      });
    }, 3000);
  }
}
