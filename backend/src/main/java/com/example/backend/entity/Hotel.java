package com.example.backend.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer roomprice;

    @Column(length = 2000)
    private String imageurl;

    private String description;

    private String city;

    private String email;

    private Integer rating;

    private String wifi;

    private String gym;

    private String pool;

    @CreationTimestamp
    private LocalDate createddt;

    @UpdateTimestamp
    private LocalDate updateddt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(Integer roomprice) {
        this.roomprice = roomprice;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public LocalDate getCreateddt() {
        return createddt;
    }

    public void setCreateddt(LocalDate createddt) {
        this.createddt = createddt;
    }

    public LocalDate getUpdateddt() {
        return updateddt;
    }

    public void setUpdateddt(LocalDate updateddt) {
        this.updateddt = updateddt;
    }

//    public List<Booking> getBooking() {
//        return booking;
//    }
//
//    public void setBooking(List<Booking> booking) {
//        this.booking = booking;
//    }
}
