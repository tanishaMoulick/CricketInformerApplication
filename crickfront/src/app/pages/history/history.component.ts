import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ApiCallService } from '../../services/api-call.service';
import { MatchCardComponent } from '../../../../components/match-card/match-card.component';


@Component({
  selector: 'app-history',
  standalone: true,
  imports: [CommonModule,MatchCardComponent],
  templateUrl: './history.component.html',
  styleUrl: './history.component.css'
})
export class HistoryComponent implements OnInit{
  private _api: any;
  allMatch: any;
loading: any;
  constructor(private_api:ApiCallService)
  {

  }
  ngOnInit(): void {
    this._api.getAllMatches().subscribe({
      next:(data: any)=>{
        this.allMatch=data
        
      },
      error:(error: any)=>{
        console.log(error)
      }
    })
  }

}
