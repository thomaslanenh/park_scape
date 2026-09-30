package com.example.rides;

import jakarta.persistence.*;

public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;
}
