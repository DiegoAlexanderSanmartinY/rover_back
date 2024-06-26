package com.robot.rover.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.robot.rover.models.Rover;
import com.robot.rover.repository.RoverRepository;

@Service
public class RoverServiceImpl implements RoverService {

    @Autowired
    RoverRepository roverRepository;

    @Override
    public Rover get() {
        //Iterable<Rover> list = (List<Rover>)roverRepository.findAll();
        //List<Rover> rList = (List<Rover>)roverRepository.findAll();
  
        List<Rover> rList = new ArrayList<>((List<Rover>) roverRepository.findAll());
        return rList.get(0);
    };
}
