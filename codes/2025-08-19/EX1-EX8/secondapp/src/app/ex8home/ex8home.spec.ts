import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex8home } from './ex8home';

describe('Ex8home', () => {
  let component: Ex8home;
  let fixture: ComponentFixture<Ex8home>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex8home]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex8home);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
