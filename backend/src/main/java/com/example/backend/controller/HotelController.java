package com.example.backend.controller;

import com.example.backend.entity.Hotel;
import com.example.backend.service.HotelService;
import com.example.backend.utils.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping("/hotel")
    public ResponseEntity<Object> getAllHotels(){
        return ResponseHandler.responseEntity("All Hotel Details.",hotelService.getAllHotels(), HttpStatus.OK);
    }

    @PostMapping("/hotel")
    public ResponseEntity<Object> saveHotels(@RequestBody Hotel hotel) {
        return ResponseHandler.responseEntity("Hotel Details Save Successfully.",hotelService.saveHotels(hotel), HttpStatus.CREATED);
    }

    @PutMapping("/hotel/{id}")
    public ResponseEntity<Object> updateHotelDetails(@PathVariable Long id,@RequestBody Hotel hotel) throws Exception{
        return ResponseHandler.responseEntity("Hotel Details updated Successfully.",hotelService.updateHotelDetails(id,hotel), HttpStatus.OK);
    }

    @DeleteMapping("/hotel/{id}")
    public ResponseEntity<Object> deleteHotel(@PathVariable Long id) throws Exception{
        return ResponseHandler.responseEntity("Hotel Deleted Save Successfully.",hotelService.deleteHotel(id), HttpStatus.NO_CONTENT);
    }
}
