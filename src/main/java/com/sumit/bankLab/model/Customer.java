package com.sumit.bankLab.model;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String  firstName;
    private String lastName;
    @Column(unique = true)
    private String  email;
    //@Column(unique = true)
    private String phoneNumber;

}
