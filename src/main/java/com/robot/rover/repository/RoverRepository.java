package com.robot.rover.repository;

import org.springframework.data.repository.CrudRepository;

import com.robot.rover.models.Rover;



public interface RoverRepository extends CrudRepository<Rover, Long> {

}
