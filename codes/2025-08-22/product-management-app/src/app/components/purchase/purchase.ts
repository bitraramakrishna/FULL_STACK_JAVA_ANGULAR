import { Component, OnInit, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProductService, Product, Order } from '../../services/product';

@Component({
  selector: 'app-purchase',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  template: `
    <div class="container mt-4">
      <div class="row justify-content-center">
        <div class="col-md-8">
          <div class="card">
            <div class="card-header">
              <h3 class="mb-0">Purchase Products</h3>
            </div>
            <div class="card-body">
              <div *ngIf="orderPlaced" class="alert alert-success alert-dismissible">
                <strong>Success!</strong> Order placed successfully!
                <button type="button" class="btn-close" (click)="orderPlaced = false"></button>
              </div>

              <div *ngIf="error" class="alert alert-danger">{{ error }}</div>

              <form [formGroup]="purchaseForm" (ngSubmit)="placeOrder()">
                <div class="mb-3">
                  <label for="productId" class="form-label">Select Product *</label>
                  <select 
                    id="productId"
                    class="form-select" 
                    formControlName="productId" 
                    (change)="onProductSelect()">
                    <option value="">Choose a product...</option>
                    <option *ngFor="let product of products" [value]="product.id">
                      {{ product.name }} - {{ product.price | currency }} (Stock: {{ product.qty }})
                    </option>
                  </select>
                </div>

                <div class="mb-3" *ngIf="selectedProduct">
                  <div class="card bg-light">
                    <div class="card-body">
                      <h6 class="card-title">{{ selectedProduct.name }}</h6>
                      <p class="card-text">
                        <strong>Category:</strong> {{ selectedProduct.category }}<br>
                        <strong>Price:</strong> {{ selectedProduct.price | currency }}<br>
                        <strong>Available Stock:</strong> {{ selectedProduct.qty }}
                      </p>
                    </div>
                  </div>
                </div>

                <div class="mb-3" *ngIf="selectedProduct">
                  <label for="qty" class="form-label">Quantity to Purchase *</label>
                  <input 
                    type="number" 
                    id="qty"
                    class="form-control" 
                    formControlName="qty"
                    [max]="selectedProduct.qty" 
                    min="1"
                    [class.is-invalid]="purchaseForm.get('qty')?.invalid && purchaseForm.get('qty')?.touched">
                  <div class="invalid-feedback">
                    {{ getQtyError() }}
                  </div>
                  <div class="form-text">
                    Maximum available: {{ selectedProduct.qty }}
                  </div>
                </div>

                <div class="mb-3" *ngIf="selectedProduct && purchaseForm.get('qty')?.value">
                  <div class="alert alert-info">
                    <strong>Total Amount:</strong> 
                    {{ (selectedProduct.price * purchaseForm.get('qty')?.value) | currency }}
                  </div>
                </div>

                <div class="d-grid">
                  <button 
                    type="submit" 
                    class="btn btn-success btn-lg" 
                    [disabled]="purchaseForm.invalid || !selectedProduct || loading">
                    <span *ngIf="loading" class="spinner-border spinner-border-sm me-2"></span>
                    Place Order
                  </button>
                </div>
              </form>

              <div *ngIf="products.length === 0" class="alert alert-warning mt-3">
                No products available for purchase. All products are out of stock.
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  `,
  styles: []
})
export class PurchaseComponent implements OnInit {
  private fb = inject(FormBuilder);
  private productService = inject(ProductService);

  purchaseForm: FormGroup;
  products: Product[] = [];
  selectedProduct: Product | null = null;
  loading = false;
  orderPlaced = false;
  error = '';

  constructor() {
    this.purchaseForm = this.fb.group({
      productId: ['', Validators.required],
      qty: [1, [Validators.required, Validators.min(1)]]
    });
  }

  ngOnInit(): void {
    this.loadProducts();
  }

  loadProducts(): void {
    this.productService.getProducts().subscribe({
      next: (products) => {
        this.products = products.filter(p => p.qty > 0);
      },
      error: (err) => {
        this.error = 'Error loading products';
        console.error('Error:', err);
      }
    });
  }

  onProductSelect(): void {
    const productId = this.purchaseForm.get('productId')?.value;
    this.selectedProduct = this.products.find(p => p.id == productId) || null;
    
    if (this.selectedProduct) {
      this.purchaseForm.get('qty')?.setValidators([
        Validators.required,
        Validators.min(1),
        Validators.max(this.selectedProduct.qty)
      ]);
      this.purchaseForm.get('qty')?.updateValueAndValidity();
    }
  }

  placeOrder(): void {
    if (this.purchaseForm.valid && this.selectedProduct) {
      this.loading = true;
      const qty = this.purchaseForm.get('qty')?.value;
      
      const order: Order = {
        productId: this.selectedProduct.id!,
        productName: this.selectedProduct.name,
        qty: qty,
        orderDate: new Date()
      };

      const updatedProduct = {
        ...this.selectedProduct,
        qty: this.selectedProduct.qty - qty
      };

      this.productService.placeOrder(order).subscribe({
        next: () => {
          this.productService.updateProduct(this.selectedProduct!.id!, updatedProduct).subscribe({
            next: () => {
              this.orderPlaced = true;
              this.loading = false;
              this.purchaseForm.reset();
              this.selectedProduct = null;
              this.loadProducts();
              
              setTimeout(() => this.orderPlaced = false, 5000);
            },
            error: (err) => {
              this.error = 'Error updating product quantity';
              this.loading = false;
              console.error('Error:', err);
            }
          });
        },
        error: (err) => {
          this.error = 'Error placing order';
          this.loading = false;
          console.error('Error:', err);
        }
      });
    }
  }

  getQtyError(): string {
    const qtyControl = this.purchaseForm.get('qty');
    if (qtyControl && qtyControl.errors && qtyControl.touched) {
      if (qtyControl.errors['required']) return 'Quantity is required';
      if (qtyControl.errors['min']) return 'Quantity must be at least 1';
      if (qtyControl.errors['max']) return `Cannot exceed available quantity (${this.selectedProduct?.qty})`;
    }
    return '';
  }
}