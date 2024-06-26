package com.robot.rover.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.robot.rover.models.Obstacle;
import com.robot.rover.repository.ObstacleRepository;

@Service
public class ObstacleServiceImp implements ObstacleService{

    @Autowired
    public ObstacleRepository obstacleRepository;

    @Override
    public List<Obstacle> findAll() {
          return (List<Obstacle>) obstacleRepository.findAll(); 
    }

    

}
