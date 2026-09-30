package com.example.rides;

import jakarta.persistence.*;

public class OperatingHours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int openTime;
    private int closeTime;
    private int extraHoursHotel;
    private int afterHours;

    @ManyToOne
    @JoinColumn(name="park_id")
    private Park park;
}
