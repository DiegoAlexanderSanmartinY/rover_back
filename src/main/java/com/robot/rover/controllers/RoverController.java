package com.robot.rover.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robot.rover.dto.CommandDto;
import com.robot.rover.dto.RoverDto;

import com.robot.rover.models.Rover;

import com.robot.rover.services.RoverServiceImpl;




@RestController
@RequestMapping("/api/rover")
@CrossOrigin(origins = "*")
public class RoverController  {

    @Autowired
    RoverServiceImpl roverService;
    @PostMapping
    public void create(@RequestBody RoverDto rover) {
        System.out.println(rover);
    }

    @GetMapping
    public Rover get() {
      return roverService.get();
    }

    @PostMapping("/command")
    public void sendCommand (@RequestBody CommandDto comand) {
            comand.getCommands().stream().forEach(command -> { roverService.sendCommands("F");
    });
    }

  




}
