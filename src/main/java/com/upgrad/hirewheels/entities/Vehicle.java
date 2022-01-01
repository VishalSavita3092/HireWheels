package com.upgrad.hirewheels.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
public class Vehicle {
    @Id
    @GeneratedValue
    private int vehicleId;
    
    @Column(name = "vehicle_model", nullable = false, length = 50)
    private String model;

    @Column(name = "vehicle_number", length = 10, nullable = false)
    private String  vehicleNumber;

    @Column(length = 50, nullable = false)
    private String color;

    @ManyToOne
    @JoinColumn(name = "vehicle_subcategory_id")
    @JsonBackReference
    private VehicleSubCategory vehicleSubCategory;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    @JsonBackReference
    private Location location;

    @ManyToOne
    @JoinColumn(name = "fuel_type_id")
    @JsonBackReference
    private FuelType fuelType;

    @Column(name = "availability_status", length = 1)
    private int availabilityStatus;

    @Column(name = "public_image_url", length = 500)
    private String publicImageURl;
}
