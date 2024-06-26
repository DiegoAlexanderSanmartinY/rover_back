package com.robot.rover.dto;

import com.robot.rover.models.Direction;

import lombok.Data;

@Data
public class RoverDto {

    private Integer x;
    private Integer y;
    private Direction direction;

}
