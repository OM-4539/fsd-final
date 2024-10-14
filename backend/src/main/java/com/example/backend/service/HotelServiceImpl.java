package com.example.backend.service;

import com.example.backend.entity.Hotel;
import com.example.backend.exception.DataNotFoundException;
import com.example.backend.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    HotelRepository hotelRepository;


    @Override
    public List<Hotel> getAllHotels() {
        return  hotelRepository.findAll();
    }

    @Override
    public Hotel saveHotels(Hotel hotel) {

            return hotelRepository.save(hotel);
    }

    @Override
    public Hotel updateHotelDetails(Long id, Hotel hotel) throws DataNotFoundException {
        Optional<Hotel> hotelOptional = hotelRepository.findById(id);
        if(hotelOptional.isPresent()){
            Hotel hotel1 = new Hotel();
            hotel1.setCity(hotel.getCity());
            hotel1.setName(hotel.getName());
            hotel1.setDescription(hotel.getDescription());
            hotel1.setEmail(hotel.getEmail());
            hotel1.setGym(hotel.getGym());
            hotel1.setPool(hotel.getPool());
            hotel1.setImageurl(hotel.getImageurl());
            hotel1.setRating(hotel.getRating());
            hotel1.setRoomprice(hotel.getRoomprice());
            hotel1.setWifi(hotel.getWifi());
//            hotel1.setBooking(hotel.getBooking());
           return hotelRepository.save(hotel1);
        }
        throw new DataNotFoundException("Record Not Found");
    }

    @Override
    public String deleteHotel(Long id) throws DataNotFoundException {
        Optional<Hotel> hotelOptional = hotelRepository.findById(id);
        if(hotelOptional.isPresent()){
            hotelRepository.deleteById(id);
            return "Deleted";
        }
        throw new DataNotFoundException("Record Not Found");
    }
}
