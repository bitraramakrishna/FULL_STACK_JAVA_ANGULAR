import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex2calendar } from './ex2calendar';

describe('Ex2calendar', () => {
  let component: Ex2calendar;
  let fixture: ComponentFixture<Ex2calendar>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex2calendar]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex2calendar);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
