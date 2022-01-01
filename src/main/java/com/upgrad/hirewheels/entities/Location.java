package com.upgrad.hirewheels.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    @Id
    @Column(name = "location_id", unique = true)
    private int locationID;

    @Column(name = "location_Name", nullable = false)
    private String locationName;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(nullable = false)
    private String  pinCode;

//    City ID part is left
    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "location")
    private Set<Vehicle> vehicles;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "location")
    private Set<Booking> bookingList;

    public Location(int locationID, String locationName, String address, String pinCode, City city) {
        this.locationID = locationID;
        this.locationName = locationName;
        this.address = address;
        this.pinCode = pinCode;
        this.city = city;
    }
}
