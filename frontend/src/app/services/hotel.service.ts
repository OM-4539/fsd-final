import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HotelService {

  getallhotelUrl = "http://localhost:8080/api/v1/hotel"
  constructor(private httpClient:HttpClient) { }

  getHotel():Observable<any>{
   return this.httpClient.get(this.getallhotelUrl);
  }
}
