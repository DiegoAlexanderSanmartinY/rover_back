package com.robot.rover.services;



import com.robot.rover.dto.CommandDto;
import com.robot.rover.models.Rover;

public interface RoverService {

    public Rover get();
// No es necesariop segun mi analisis, pero lo dejo por si acaso.
    public void sendCommand ( CommandDto comand);
// 
    public void sendCommands(String command);
}