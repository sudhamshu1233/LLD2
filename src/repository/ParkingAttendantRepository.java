package repository;

import models.ParkingAttendant;

import java.util.HashMap;
import java.util.Map;



public class ParkingAttendantRepository {
    Map<Integer, ParkingAttendant> parkingAttendants = new HashMap<>();

    private static ParkingAttendantRepository parkingAttendantRepositoryInstance = null;

    public static ParkingAttendantRepository getParkingAttendantRepositoryInstance()
    {
        if(parkingAttendantRepositoryInstance==null)
        {
            parkingAttendantRepositoryInstance = new ParkingAttendantRepository();
        }
        return parkingAttendantRepositoryInstance;
    }
    private ParkingAttendantRepository(){}

    public void addparkingAttendant(ParkingAttendant parkingAttendant)
    {
        parkingAttendants.put(parkingAttendant.getEmployeeId(),parkingAttendant);
    }

}
