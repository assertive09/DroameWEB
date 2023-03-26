package com.droame.entities;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String email;
    
    private String phone_number;

    @OneToOne(cascade = CascadeType.ALL)
    private Booking booking;


    public Customer() {
    }


    public Customer(int id, String name, String email, String phone_number, Booking bookings) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.booking = bookings;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return this.phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Booking getBookings() {
        return this.booking;
    }

    public void setBookings(Booking bookings) {
        this.booking = bookings;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", phone_number='" + getPhone_number() + "'" +
            ", bookings='" + getBookings() + "'" +
            "}";
    }

}