import {ComponentFixture, TestBed} from '@angular/core/testing';

import {InvestComponent} from './invest.component';

describe('InvestPageComponent', () => {
  let component: InvestComponent;
  let fixture: ComponentFixture<InvestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InvestComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InvestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
