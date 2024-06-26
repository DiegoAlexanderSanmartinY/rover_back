package com.robot.rover.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="rover")
@Entity
public class Rover {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="posX")
    private Integer x;

    @Column(name="posY")
    private Integer y;

    @Enumerated(jakarta.persistence.EnumType.STRING)
    @Column(name="direction")
    private Direction direction;

}
