package services;

import models.ParkingAttendant;
import repositries.ParkingAttendantRepository;

public class ParkingAttendantService {
    public ParkingAttendant createParkingAttendant(Integer employeeId,String name)
    {
        ParkingAttendant newParkingAttendant = ParkingAttendant.builder().employeeId(employeeId).name(name).build();
//        ParkingAttendantRepository.getParkingAttendantRepositoryInstance().addparkingAttendant(newParkingAttendant);
        return newParkingAttendant;
    }
}
