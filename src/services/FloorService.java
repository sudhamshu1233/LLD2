package services;

import models.Floor;
import models.ParkingSpot;
import repository.FloorRepositry;

import java.util.List;

public class FloorService {
    public Floor createFloor(List<ParkingSpot>spots,Integer floorNumber)
    {
        return FloorRepositry.getFloorRepositryInstance().createFloor(spots,floorNumber);
    }
}
