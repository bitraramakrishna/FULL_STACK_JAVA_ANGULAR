import { Component } from '@angular/core';
import { RouterLink, RouterLinkActive } from '@angular/router';

@Component({
  selector: 'app-navigation',
  standalone: true,
  imports: [RouterLink, RouterLinkActive],
  template: `
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
      <div class="container">
        <a class="navbar-brand" href="#">Product Management System</a>
        
        <div class="navbar-nav ms-auto">
          <a class="nav-link" routerLink="/products" routerLinkActive="active" [routerLinkActiveOptions]="{exact: false}">
            Products
          </a>
          <a class="nav-link" routerLink="/purchase" routerLinkActive="active">
            Purchase
          </a>
          <a class="nav-link" routerLink="/orders" routerLinkActive="active">
            Order History
          </a>
        </div>
      </div>
    </nav>
  `,
  styles: []
})
export class NavigationComponent { }