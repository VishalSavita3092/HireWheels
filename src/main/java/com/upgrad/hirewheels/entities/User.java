package com.upgrad.hirewheels.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    
    @Id
    @Column(name = "user_id", unique = true, nullable = false, length = 10)
    private int userId;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(nullable = false, length = 50)
    private String password;

    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(length = 10, unique = true, nullable = false)
    private String mobileNumber;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false, unique = true)
//    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @Column
    private float walletMoney = 10000.0f;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Booking> bookings;

}
