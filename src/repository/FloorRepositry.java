package repository;

import lombok.Getter;
import lombok.Setter;
import models.Floor;
import models.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class FloorRepositry {
    List<Floor> floors  = new ArrayList<>();

    public static FloorRepositry  floorRepositryInstance = null;

    private FloorRepositry(){}
    public static FloorRepositry getFloorRepositryInstance()
    {
        if(floorRepositryInstance==null)
        {
            floorRepositryInstance = new FloorRepositry();
            return floorRepositryInstance;
        }
        else
        {
            return floorRepositryInstance;
        }
    }

    public Floor createFloor(List<ParkingSpot>spots,Integer floorNumber)
    {
        for(ParkingSpot parkingSpot:spots)
        {
            parkingSpot.setFloorNumber(floorNumber);
        }
        floors.add(Floor.builder().floorID(floors.size()).parkingSpots(spots).floorNumber(floorNumber).build());
        return floors.getLast();
    }




}
