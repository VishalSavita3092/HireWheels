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
public class VehicleCategory {
    @Id
    @Column(name="vehicle_category_id", unique = true, nullable = false, length = 10)
    private int vehicleCategoryID;

    @Column(name = "vehicle_category_name", nullable = false)
    private String vehicleCategoryName;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "vehicleCategory")
    private Set<VehicleSubCategory> vehicleSubCategories;
}
