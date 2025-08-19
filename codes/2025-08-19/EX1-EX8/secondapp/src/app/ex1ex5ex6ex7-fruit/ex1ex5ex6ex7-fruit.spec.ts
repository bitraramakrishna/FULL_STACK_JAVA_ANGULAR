import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex1ex5ex6ex7Fruit } from './ex1ex5ex6ex7-fruit';

describe('Ex5Fruit', () => {
  let component: Ex1ex5ex6ex7Fruit;
  let fixture: ComponentFixture<Ex1ex5ex6ex7Fruit>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex1ex5ex6ex7Fruit]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex1ex5ex6ex7Fruit);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
