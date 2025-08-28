import { Component, OnInit, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router, RouterLink } from '@angular/router';
import { ProductService, Product } from '../../services/product';

@Component({
  selector: 'app-product-list',
  standalone: true,
  imports: [CommonModule, RouterLink],
  template: `
    <div class="container mt-4">
      <div class="d-flex justify-content-between align-items-center mb-4">
        <h2>Product Management</h2>
        <button class="btn btn-primary" (click)="navigateToAdd()">
          Add New Product
        </button>
      </div>

      <div *ngIf="loading" class="text-center">
        <div class="spinner-border" role="status">
          <span class="visually-hidden">Loading...</span>
        </div>
      </div>

      <div *ngIf="error" class="alert alert-danger" role="alert">
        {{ error }}
      </div>

      <div class="card" *ngIf="!loading && !error">
        <div class="table-responsive">
          <table class="table table-striped table-hover mb-0">
            <thead>
              <tr>
                <th>ID</th>
                <th>Product Name</th>
                <th>Category</th>
                <th>Price</th>
                <th>Available Qty</th>
                <th>Actions</th>
              </tr>
            </thead>
            <tbody>
              <tr *ngFor="let product of products">
                <td>{{ product.id }}</td>
                <td>{{ product.name }}</td>
                <td>{{ product.category }}</td>
                <td>{{ product.price | currency }}</td>
                <td>
                  <span class="badge" 
                        [class]="product.qty > 5 ? 'bg-success' : product.qty > 0 ? 'bg-warning' : 'bg-danger'">
                    {{ product.qty }}
                  </span>
                </td>
                <td>
                  <button class="btn btn-sm btn-outline-primary me-2" (click)="editProduct(product.id!)">
                    Edit
                  </button>
                  <button class="btn btn-sm btn-outline-danger" (click)="deleteProduct(product.id!)">
                    Delete
                  </button>
                </td>
              </tr>
            </tbody>
          </table>
          
          <div *ngIf="products.length === 0" class="text-center p-4">
            <div class="alert alert-info">
              No products found. <a routerLink="/products/add">Add the first product</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  `,
  styles: []
})
export class ProductListComponent implements OnInit {
  private productService = inject(ProductService);
  private router = inject(Router);

  products: Product[] = [];
  loading = true;
  error = '';

  ngOnInit(): void {
    this.loadProducts();
  }

  loadProducts(): void {
    this.loading = true;
    this.productService.getProducts().subscribe({
      next: (products) => {
        this.products = products;
        this.loading = false;
      },
      error: (err) => {
        this.error = 'Error loading products';
        this.loading = false;
        console.error('Error:', err);
      }
    });
  }

  navigateToAdd(): void {
    this.router.navigate(['/products/add']);
  }

  editProduct(id: number): void {
    this.router.navigate(['/products/edit', id]);
  }

  deleteProduct(id: number): void {
    if (confirm('Are you sure you want to delete this product?')) {
      this.productService.deleteProduct(id).subscribe({
        next: () => {
          this.loadProducts();
        },
        error: (err) => {
          this.error = 'Error deleting product';
          console.error('Error:', err);
        }
      });
    }
  }
}