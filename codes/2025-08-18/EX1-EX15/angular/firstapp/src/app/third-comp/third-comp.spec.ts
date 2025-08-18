import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ThirdComp } from './third-comp';

describe('ThirdComp', () => {
  let component: ThirdComp;
  let fixture: ComponentFixture<ThirdComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ThirdComp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ThirdComp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
