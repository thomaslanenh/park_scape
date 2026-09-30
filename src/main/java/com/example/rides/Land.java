package com.example.rides;

import jakarta.persistence.*;

public class Land {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int createdDate;
    private String description;

    @ManyToOne
    @JoinColumn(name="park_id")
    private Park park;
}
