package com.example.rides;

import jakarta.persistence.*;

public class Park {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="state_id")
    private State state;
}
