package com.upgrad.hirewheels.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import java.util.Date;

@Getter
@Setter
@ToString
@Entity
public class Booking {
    @Id
    @GeneratedValue
    private int bookingID;

    @Column(name = "pickup_date",nullable = false)
    private Date pickUpDate;

    @Column(name = "dropoff_date", nullable = false)
    private Date dropOffDate;

    @Column(name = "booking_date", nullable = false)
    private Date bookingDate;

    @Column(name = "amount", nullable = false)
    private int amount;

    @ManyToOne
    @JoinColumn(name="location_id", nullable = false) //Question is name should match from SQL column name or variable name
    private Location location;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicleWithBooking;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
