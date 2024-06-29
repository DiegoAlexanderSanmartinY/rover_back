package com.robot.rover.controllers;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.mockito.ArgumentMatchers.any;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;

import com.robot.rover.dto.CommandDto;

import com.robot.rover.services.RoverServiceImpl;



@RunWith(MockitoJUnitRunner.class)
public class RoverControllerTest {

    @Mock
    private RoverServiceImpl roverServiceImpl;

    @InjectMocks
    private RoverController controller;

  
    
    @Test
    public void whenSendCommand_callService() {

        CommandDto command = new CommandDto();
        List<String> commandList = new ArrayList<>();
        commandList.add("F");
        command.setCommands(commandList);

        controller.sendCommand(command);

        verify(roverServiceImpl, times(1)).sendCommands(any());

    }

    @Test
    public void whenSendCommand_FRF_callService() {

        CommandDto command = new CommandDto();
        List<String> commandList = new ArrayList<>();
        commandList.add("F");
        commandList.add("R");
        commandList.add("F");
        command.setCommands(commandList);

        controller.sendCommand(command);

        verify(roverServiceImpl, times(3)).sendCommands(any());

    }

}
