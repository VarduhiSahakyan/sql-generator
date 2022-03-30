import {ComponentFixture, TestBed} from '@angular/core/testing';

import {SubIssuerComponent} from './sub-issuer.component';

describe('SubIssuerComponent', () => {
  let component: SubIssuerComponent;
  let fixture: ComponentFixture<SubIssuerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SubIssuerComponent]
    })
      .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SubIssuerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
