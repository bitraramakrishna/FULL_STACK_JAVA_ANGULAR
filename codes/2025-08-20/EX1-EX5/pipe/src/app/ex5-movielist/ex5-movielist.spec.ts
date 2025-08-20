import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex5Movielist } from './ex5-movielist';

describe('Ex5Movielist', () => {
  let component: Ex5Movielist;
  let fixture: ComponentFixture<Ex5Movielist>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex5Movielist]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex5Movielist);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
