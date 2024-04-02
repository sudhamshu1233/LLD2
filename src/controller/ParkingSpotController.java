package controller;

import models.ParkingSpot;
import projectenums.VehicleType;
import services.ParkingLotService;
import services.ParkingSpotService;

public class ParkingSpotController {
    ParkingSpotService parkingSpotService;
    public ParkingSpotController(ParkingSpotService parkingSpotService)
    {
        this.parkingSpotService = parkingSpotService;
    }
    public ParkingSpot createParkingSpot(VehicleType vehicleType, Integer floorNumber)
    {
        return parkingSpotService.createParkingSpot(vehicleType,floorNumber);
    }
}
