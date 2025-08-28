import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormControl, ReactiveFormsModule } from '@angular/forms';
import { MatCardModule } from '@angular/material/card';
import { MatListModule } from '@angular/material/list';
import { MatStepperModule } from '@angular/material/stepper';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { MatSelectModule } from '@angular/material/select';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';
import { MatIconModule } from '@angular/material/icon';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    CommonModule,
    ReactiveFormsModule,
    MatCardModule,
    MatListModule,
    MatStepperModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatSelectModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatIconModule
  ],
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class App {
  title = 'angular-exercises';

  // Ex1: List of cities
  cities: string[] = [
    'New York',
    'London',
    'Tokyo',
    'Hyderabad',
    'Sydney',
    'Mumbai',
    'Bengaluru',
    'Dubai',
    'Singapore'
  ];

  // Ex2: Stepper form data
  stepperFormGroup: FormGroup;
  isLinear = false;

  
  get nameControl() { return this.stepperFormGroup.get('name')!; }
  get ageControl() { return this.stepperFormGroup.get('age')!; }
  get emailControl() { return this.stepperFormGroup.get('email')!; }

  

  // Ex3: FormControl for reverse text
  textControl = new FormControl('');
  reversedText = '';

  // Ex4 & Ex5: Registration form with validation
  registrationForm: FormGroup;
  subjects = ['Computer Science', 'Mathematics', 'Physics', 'Chemistry', 'Biology', 'Literature'];

  constructor(private formBuilder: FormBuilder) {
    // Ex2: Initialize stepper form
    this.stepperFormGroup = this.formBuilder.group({
      name: ['', Validators.required],
      age: ['', [Validators.required, Validators.min(1), Validators.max(120)]],
      email: ['', [Validators.required, Validators.email]]
    });

    // Ex4 & Ex5: Initialize registration form with validation
    this.registrationForm = this.formBuilder.group({
      name: ['', [Validators.required, Validators.minLength(2)]],
      email: ['', [Validators.required, Validators.email]],
      dateOfBirth: ['', Validators.required],
      subject: ['', Validators.required]
    });

    // Ex3: Listen to text changes and reverse them
    this.textControl.valueChanges.subscribe(value => {
      this.reversedText = value ? value.split('').reverse().join('') : '';
    });
  }

  // Ex2: Stepper methods
  onStepperSubmit() {
    if (this.stepperFormGroup.valid) {
      console.log('Stepper Form Data:', this.stepperFormGroup.value);
      alert('Stepper form submitted successfully!');
    }
  }

  // Ex4 & Ex5: Registration form methods
  onRegistrationSubmit() {
    if (this.registrationForm.valid) {
      console.log('Registration Form Data:', this.registrationForm.value);
      alert('Registration successful!');
    } else {
      console.log('Form is invalid');
      this.markFormGroupTouched(this.registrationForm);
    }
  }

  
  private markFormGroupTouched(formGroup: FormGroup) {
    Object.keys(formGroup.controls).forEach(field => {
      const control = formGroup.get(field);
      control?.markAsTouched({ onlySelf: true });
    });
  }

  // Ex5: Check if submit button should be disabled
  isSubmitDisabled(): boolean {
    return !this.registrationForm.valid;
  }

  // Helper methods for validation error display
  getErrorMessage(controlName: string, formGroup: FormGroup): string {
    const control = formGroup.get(controlName);
    if (control?.errors && control.touched) {
      if (control.errors['required']) {
        return `${controlName.charAt(0).toUpperCase() + controlName.slice(1)} is required`;
      }
      if (control.errors['email']) {
        return 'Please enter a valid email address';
      }
      if (control.errors['minLength']) {
        return `${controlName.charAt(0).toUpperCase() + controlName.slice(1)} must be at least ${control.errors['minLength'].requiredLength} characters`;
      }
      if (control.errors['min']) {
        return 'Age must be at least 1';
      }
      if (control.errors['max']) {
        return 'Age must not exceed 120';
      }
    }
    return '';
  }
}
