package repository;

import models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepositry {
    Map<Integer,ParkingLot> parkingLotMap = new HashMap<>();
    private static ParkingLotRepositry parkingLotRepositryInstance;
    private ParkingLotRepositry()
    {

    }

    public static ParkingLotRepositry getParkingLotRepositryInstance()
    {
        if(parkingLotRepositryInstance==null)
        {
            parkingLotRepositryInstance =  new ParkingLotRepositry();
            return parkingLotRepositryInstance;
        }
        else
        {
            return parkingLotRepositryInstance;
        }
    }

    public void createParkingLot(ParkingLot parkingLot)
    {
        parkingLotMap.put(parkingLot.getId(),parkingLot);

    }

    public ParkingLot getParkingLot(Integer id)
    {
        return parkingLotMap.get(id);
    }
}
