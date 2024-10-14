package com.example.backend.service;

import com.example.backend.entity.Hotel;
import com.example.backend.exception.DataNotFoundException;

import java.util.List;

public interface HotelService {

    public List<Hotel> getAllHotels();

    public Hotel saveHotels(Hotel hotel);

    public Hotel updateHotelDetails(Long id, Hotel hotel) throws DataNotFoundException;

    public String deleteHotel(Long id) throws DataNotFoundException;
}
