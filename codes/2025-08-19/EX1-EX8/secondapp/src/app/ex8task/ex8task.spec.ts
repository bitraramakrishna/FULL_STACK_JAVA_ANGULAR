import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex8task } from './ex8task';

describe('Ex8task', () => {
  let component: Ex8task;
  let fixture: ComponentFixture<Ex8task>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex8task]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex8task);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
