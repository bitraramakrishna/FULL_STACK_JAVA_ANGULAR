import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EX15Home } from './ex15-home';

describe('EX15Home', () => {
  let component: EX15Home;
  let fixture: ComponentFixture<EX15Home>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EX15Home]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EX15Home);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
