import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex8tasklist } from './ex8tasklist';

describe('Ex8tasklist', () => {
  let component: Ex8tasklist;
  let fixture: ComponentFixture<Ex8tasklist>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex8tasklist]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex8tasklist);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
