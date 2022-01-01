package com.upgrad.hirewheels.entities;



import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "vehicle_subcategory")
public class VehicleSubCategory {
    @Id
    @Column
    private  int vehicleSubCategoryId;

    @Column(name = "vehicle_subcategory_name", nullable = false, length = 50, unique = true)
    private String vehicleSubCategoryName;

    @Column(name = "price_per_day", length = 10, nullable = false)
    private int pricePerDay;

    @ManyToOne
    @JoinColumn(name = "vehicle_category_id", nullable = false)
    private VehicleCategory vehicleCategory;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "vehicleSubCategory")
    private Set<Vehicle> vehicles;
}
