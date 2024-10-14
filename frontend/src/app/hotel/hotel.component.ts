import { Component, OnInit } from '@angular/core';
import { HotelService } from '../services/hotel.service';
import { RouterOutlet } from '@angular/router';
import { Hotel } from '../interface/hotelinterface';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-hotel',
  standalone: true,
  imports: [RouterOutlet,ReactiveFormsModule],
  templateUrl: './hotel.component.html',
  styleUrl: './hotel.component.css'
})
export class HotelComponent implements OnInit{
hotels:Hotel[] =[];
  constructor(private hotelService:HotelService){}

  ngOnInit(): void {
      this.hotelService.getHotel().subscribe((res: any)=>{
       console.log(res);
       this.hotels=res.payload
      })
  }
  name = new FormControl("",[])
  city = new FormControl("",[])
  rating = new FormControl("5",[
    Validators.min(0),
    Validators.max(5)
  ])

  hotelGroup = new FormGroup({
    name:this.name,
   city:this.city,
   rating:this.rating
  })
  
  

  filterOnSubmit(){
    console.log(this.hotelGroup)
    this.hotelGroup.value
  }
  }


