import { Routes } from '@angular/router';
import { ProductListComponent } from './components/product-list/product-list';
import { ProductFormComponent } from './components/product-form/product-form';
import { PurchaseComponent } from './components/purchase/purchase';
import { OrderHistoryComponent } from './components/order-history/order-history';

export const routes: Routes = [
  { path: '', redirectTo: '/products', pathMatch: 'full' },
  { path: 'products', component: ProductListComponent },
  { path: 'products/add', component: ProductFormComponent },
  { path: 'products/edit/:id', component: ProductFormComponent },
  { path: 'purchase', component: PurchaseComponent },
  { path: 'orders', component: OrderHistoryComponent },
  { path: '**', redirectTo: '/products' }
];