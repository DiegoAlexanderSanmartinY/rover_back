package com.robot.rover.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import com.robot.rover.models.Direction;
import com.robot.rover.models.Rover;
import com.robot.rover.repository.RoverRepository;


@RunWith(MockitoJUnitRunner.class)
public class RoverServiceImplTest {

    @Mock
    private RoverRepository roverRepository;

    @InjectMocks
    private RoverServiceImpl serviceImpl;

    
    @Test
    public void whenSendCommand_callService() {

        Rover rover = new Rover();
        rover.setX(5);
        rover.setY(5);
        rover.setDirection(Direction.NORTH);     
        List<Rover> roverList = new ArrayList<>();
        roverList.add(rover);
        when(roverRepository.findAll()).thenReturn(roverList);
       
        serviceImpl.sendCommands("F");
        Rover finalRover = new Rover();
        finalRover.setX(5);
        finalRover.setY(4);
        finalRover.setDirection(Direction.NORTH); 

        verify(roverRepository, times(1)).save(finalRover);

    }


}
