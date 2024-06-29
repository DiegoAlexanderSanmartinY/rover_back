package com.robot.rover.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robot.rover.dto.ObstacleDto;
import com.robot.rover.models.Obstacle;
import com.robot.rover.services.ObstacleServiceImp;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ObstacleController {

    @Autowired
    public ObstacleServiceImp obstacleServiceImp;

    @PostMapping("/obstacle")
    public void create(@RequestBody ObstacleDto obstacle) {
        System.out.println(obstacle);
    }

    @GetMapping("/obstacle")
    public List<Obstacle> findAll() {
        return obstacleServiceImp.findAll();
    }
}
