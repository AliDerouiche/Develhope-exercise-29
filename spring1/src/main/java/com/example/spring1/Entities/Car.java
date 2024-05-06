package com.example.spring1.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;

@Data
@Entity
@Table (name = "cars")
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "modelName", nullable = false)
    private String modelName;

    @Column(name = "serialNumber", nullable = false)
    private Long serialNumber;

    @Column(name = "currentPrice")
    private Double currentPrice;

}