package com.example.backend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String name;

    private String mobile;

    private String email;

    @CreationTimestamp
    private LocalDate createddt;

    @UpdateTimestamp
    private LocalDate updateddt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
