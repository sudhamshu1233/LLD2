package repositries;

import models.ParkingSpot;
import projectenums.ParkingSpotStatus;
import projectenums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotRepositry {
    List<ParkingSpot> parkingSpots  = new ArrayList<>();

    private static ParkingSpotRepositry parkingSpotRepositryInstance;

    private ParkingSpotRepositry(){

    }

    public static ParkingSpotRepositry getParkingSpotRepositryInstance()
    {
        if(parkingSpotRepositryInstance==null)
        {
            parkingSpotRepositryInstance = new ParkingSpotRepositry();

        }
        return parkingSpotRepositryInstance;
    }

    public ParkingSpot createNewParkingSpot(VehicleType supportedVehicleType,Integer floorNumber)
    {
        parkingSpots.add(ParkingSpot.builder()
                .supportedVehicleType(supportedVehicleType)
                .parkingSpotStatus(ParkingSpotStatus.EMPTY)
                .spotId(parkingSpots.size())
                .floorNumber(floorNumber)
                .build());
        return parkingSpots.getLast();
    }

}
