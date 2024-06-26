package com.robot.rover.services;

import java.util.List;



import com.robot.rover.dto.ObstacleDto;
import com.robot.rover.models.Obstacle;


public interface ObstacleService {

    public List<Obstacle> findAll();

}
