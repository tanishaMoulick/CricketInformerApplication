import { ComponentFixture, TestBed } from '@angular/core/testing';
import { LiveComponent } from './live.component';

describe('LiveComponent', () => {
  let component: LiveComponent;
  let fixture: ComponentFixture<LiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LiveComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(LiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
