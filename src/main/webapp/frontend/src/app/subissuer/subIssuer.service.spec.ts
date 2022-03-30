import {TestBed} from '@angular/core/testing';

import {SubIssuerService} from './subIssuer.service';

describe('SubIssuerService', () => {
  let service: SubIssuerService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SubIssuerService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
