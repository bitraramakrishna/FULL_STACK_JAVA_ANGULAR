import { Component, OnInit, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';
import { ProductService, Order } from '../../services/product';

@Component({
  selector: 'app-order-history',
  standalone: true,
  imports: [CommonModule, RouterLink],
  template: `
    <div class="container mt-4">
      <div class="d-flex justify-content-between align-items-center mb-4">
        <h2>Order History</h2>
        <button class="btn btn-outline-secondary" (click)="loadOrders()">
           Refresh
        </button>
      </div>

      <div *ngIf="loading" class="text-center">
        <div class="spinner-border" role="status">
          <span class="visually-hidden">Loading...</span>
        </div>
      </div>

      <div *ngIf="error" class="alert alert-danger">{{ error }}</div>

      <div *ngIf="!loading && !error">
        <div class="card mb-3" *ngIf="orders.length > 0">
          <div class="card-body">
            <div class="row text-center">
              <div class="col-md-4">
                <h5 class="text-primary">{{ orders.length }}</h5>
                <small class="text-muted">Total Orders</small>
              </div>
              <div class="col-md-4">
                <h5 class="text-success">{{ getTotalAmount() }}</h5>
                <small class="text-muted">Items Purchased</small>
              </div>
              <div class="col-md-4">
                <h5 class="text-info">{{ (orders[0].orderDate | date:'shortDate') || 'N/A' }}</h5>
                <small class="text-muted">Last Order</small>
              </div>
            </div>
          </div>
        </div>

        <div class="card">
          <div class="table-responsive" *ngIf="orders.length > 0">
            <table class="table table-striped table-hover mb-0">
              <thead>
                <tr>
                  <th>Order #</th>
                  <th>Order Date</th>
                  <th>Product Name</th>
                  <th>Quantity</th>
                  <th>Status</th>
                </tr>
              </thead>
              <tbody>
                <tr *ngFor="let order of orders; let i = index">
                  <td><strong>#{{ order.id || (i + 1) }}</strong></td>
                  <td>{{ order.orderDate | date:'medium' }}</td>
                  <td>{{ order.productName }}</td>
                  <td>
                    <span class="badge bg-primary">{{ order.qty }}</span>
                  </td>
                  <td>
                    <span class="badge bg-success">Completed</span>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>

          <div *ngIf="orders.length === 0" class="card-body text-center">
            <div class="alert alert-info">
              <h5>No orders found</h5>
              <p class="mb-0">
                You haven't placed any orders yet. 
                <a routerLink="/purchase" class="btn btn-primary btn-sm ms-2">Start Shopping</a>
              </p>
            </div>
          </div>
        </div>
      </div>
    </div>
  `,
  styles: []
})
export class OrderHistoryComponent implements OnInit {
  private productService = inject(ProductService);

  orders: Order[] = [];
  loading = true;
  error = '';

  ngOnInit(): void {
    this.loadOrders();
  }

  loadOrders(): void {
    this.loading = true;
    this.productService.getOrders().subscribe({
      next: (orders) => {
        this.orders = orders.sort((a, b) => 
          new Date(b.orderDate).getTime() - new Date(a.orderDate).getTime()
        );
        this.loading = false;
      },
      error: (err) => {
        this.error = 'Error loading order history';
        this.loading = false;
        console.error('Error:', err);
      }
    });
  }

  getTotalAmount(): number {
    return this.orders.reduce((total, order) => total + (order.qty || 0), 0);
  }
}