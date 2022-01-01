package com.upgrad.hirewheels.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class City {
    @Id
    @Column(name = "city_id",unique = true)
    private int cityId;

    @Column(name = "city_name",nullable = false)
    private String cityName;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "city")
    private Set<Location> locations;
}
