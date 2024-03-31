package services;

import models.ParkingSpot;
import projectenums.VehicleType;
import repository.ParkingSpotRepositry;

public class ParkingSpotService {
    public ParkingSpot createParkingSpot(VehicleType vehicleType, Integer floorNumber)
    {
        return ParkingSpotRepositry.getParkingSpotRepositryInstance().createNewParkingSpot(vehicleType,floorNumber);

    }


}
