package com.example.rides;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    private int minimumHeightInches;

    private int openingDate;

    @ManyToOne
    @JoinColumn(name="land_id")
    private Land land;
}
