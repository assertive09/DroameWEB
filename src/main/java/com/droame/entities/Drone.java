package com.droame.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Drone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int drone_shot_id;

    private String name;
    @OneToOne(cascade=CascadeType.ALL)
    private Booking booking;

    public int getDrone_shot_id() {
        return this.drone_shot_id;
    }

    @Override
    public String toString() {
        return "{" +
                " drone_shot_id='" + getDrone_shot_id() + "'" +
                ", name='" + getName() + "'" +
                ", booking='" + getBooking() + "'" +
                "}";
    }

    public Drone() {
    }

    public void setDrone_shot_id(int drone_shot_id) {
        this.drone_shot_id = drone_shot_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Booking getBooking() {
        return this.booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

}
