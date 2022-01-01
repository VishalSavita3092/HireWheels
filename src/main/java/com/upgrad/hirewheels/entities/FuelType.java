package com.upgrad.hirewheels.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class FuelType {
    @Id
    @Column(name = "fuel_type_id", unique = true, nullable = false)
    private int fuelTypeId;

    @Column(name = "fuel_type", nullable = false, unique = true)
    private String fuelType;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,mappedBy = "fuelType")
    private Set<Vehicle> vehicles;
}
