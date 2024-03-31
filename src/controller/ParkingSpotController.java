package controller;

import models.ParkingSpot;
import projectenums.VehicleType;
import services.ParkingSpotService;

public class ParkingSpotController {
    public ParkingSpot createParkingSpot(VehicleType vehicleType, Integer floorNumber)
    {
        return new ParkingSpotService().createParkingSpot(vehicleType,floorNumber);
    }
}
