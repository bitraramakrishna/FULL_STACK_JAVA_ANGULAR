import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex2ex3ex4 } from './ex2ex3ex4';

describe('Ex2ex3ex4', () => {
  let component: Ex2ex3ex4;
  let fixture: ComponentFixture<Ex2ex3ex4>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex2ex3ex4]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex2ex3ex4);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
