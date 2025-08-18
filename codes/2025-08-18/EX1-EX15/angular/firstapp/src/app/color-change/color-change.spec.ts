import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ColorChange } from './color-change';

describe('ColorChange', () => {
  let component: ColorChange;
  let fixture: ComponentFixture<ColorChange>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ColorChange]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ColorChange);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
