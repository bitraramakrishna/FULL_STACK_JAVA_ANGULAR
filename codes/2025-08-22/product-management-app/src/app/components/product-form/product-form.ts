import { Component, OnInit, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductService, Product } from '../../services/product';

@Component({
  selector: 'app-product-form',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  template: `
    <div class="container mt-4">
      <div class="row justify-content-center">
        <div class="col-md-8">
          <div class="card">
            <div class="card-header">
              <h3 class="mb-0">{{ isEditMode ? 'Edit Product' : 'Add New Product' }}</h3>
            </div>
            <div class="card-body">
              <div *ngIf="loading" class="text-center">
                <div class="spinner-border" role="status"></div>
              </div>

              <div *ngIf="error" class="alert alert-danger">{{ error }}</div>

              <form [formGroup]="productForm" (ngSubmit)="onSubmit()" *ngIf="!loading">
                <div class="mb-3">
                  <label for="name" class="form-label">Product Name *</label>
                  <input 
                    type="text" 
                    id="name"
                    class="form-control" 
                    formControlName="name"
                    [class.is-invalid]="productForm.get('name')?.invalid && productForm.get('name')?.touched">
                  <div class="invalid-feedback">
                    {{ getFieldError('name') }}
                  </div>
                </div>

                <div class="mb-3">
                  <label for="category" class="form-label">Category *</label>
                  <input 
                    type="text" 
                    id="category"
                    class="form-control" 
                    formControlName="category"
                    [class.is-invalid]="productForm.get('category')?.invalid && productForm.get('category')?.touched">
                  <div class="invalid-feedback">
                    {{ getFieldError('category') }}
                  </div>
                </div>

                <div class="mb-3">
                  <label for="price" class="form-label">Price  *</label>
                  <input 
                    type="number" 
                    id="price"
                    step="0.01" 
                    class="form-control" 
                    formControlName="price"
                    [class.is-invalid]="productForm.get('price')?.invalid && productForm.get('price')?.touched">
                  <div class="invalid-feedback">
                    {{ getFieldError('price') }}
                  </div>
                </div>

                <div class="mb-3">
                  <label for="qty" class="form-label">Quantity *</label>
                  <input 
                    type="number" 
                    id="qty"
                    class="form-control" 
                    formControlName="qty"
                    [class.is-invalid]="productForm.get('qty')?.invalid && productForm.get('qty')?.touched">
                  <div class="invalid-feedback">
                    {{ getFieldError('qty') }}
                  </div>
                </div>

                <div class="d-flex justify-content-between">
                  <button type="button" class="btn btn-secondary" (click)="cancel()">
                    Cancel
                  </button>
                  <button 
                    type="submit" 
                    class="btn btn-primary" 
                    [disabled]="productForm.invalid || loading">
                    {{ isEditMode ? 'Update Product' : 'Create Product' }}
                  </button>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  `,
  styles: []
})
export class ProductFormComponent implements OnInit {
  private fb = inject(FormBuilder);
  private productService = inject(ProductService);
  private route = inject(ActivatedRoute);
  private router = inject(Router);

  productForm: FormGroup;
  isEditMode = false;
  productId: number | null = null;
  loading = false;
  error = '';

  constructor() {
    this.productForm = this.fb.group({
      name: ['', [Validators.required, Validators.minLength(2)]],
      category: ['', [Validators.required, Validators.minLength(2)]],
      price: [0, [Validators.required, Validators.min(0.01)]],
      qty: [0, [Validators.required, Validators.min(0)]]
    });
  }

  ngOnInit(): void {
    this.productId = +this.route.snapshot.params['id'];
    this.isEditMode = !!this.productId;

    if (this.isEditMode) {
      this.loadProduct();
    }
  }

  loadProduct(): void {
    this.loading = true;
    this.productService.getProduct(this.productId!).subscribe({
      next: (product) => {
        this.productForm.patchValue(product);
        this.loading = false;
      },
      error: (err) => {
        this.error = 'Error loading product';
        this.loading = false;
        console.error('Error:', err);
      }
    });
  }

  onSubmit(): void {
    if (this.productForm.valid) {
      this.loading = true;
      const product: Product = this.productForm.value;

      const operation = this.isEditMode 
        ? this.productService.updateProduct(this.productId!, product)
        : this.productService.createProduct(product);

      operation.subscribe({
        next: () => {
          this.router.navigate(['/products']);
        },
        error: (err) => {
          this.error = this.isEditMode ? 'Error updating product' : 'Error creating product';
          this.loading = false;
          console.error('Error:', err);
        }
      });
    }
  }

  cancel(): void {
    this.router.navigate(['/products']);
  }

  getFieldError(fieldName: string): string {
    const field = this.productForm.get(fieldName);
    if (field && field.errors && field.touched) {
      if (field.errors['required']) return `${fieldName} is required`;
      if (field.errors['minlength']) return `${fieldName} is too short`;
      if (field.errors['min']) return `${fieldName} must be greater than 0`;
    }
    return '';
  }
}