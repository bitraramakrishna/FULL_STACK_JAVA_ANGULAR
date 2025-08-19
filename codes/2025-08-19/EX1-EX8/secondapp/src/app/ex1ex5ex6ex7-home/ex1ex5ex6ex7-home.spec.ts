import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex1ex5ex6ex7Home } from './ex1ex5ex6ex7-home';

describe('Ex1ex5ex6ex7Home', () => {
  let component: Ex1ex5ex6ex7Home;
  let fixture: ComponentFixture<Ex1ex5ex6ex7Home>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex1ex5ex6ex7Home]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex1ex5ex6ex7Home);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
