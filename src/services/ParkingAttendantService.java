package services;

import models.ParkingAttendant;

public class ParkingAttendantService {
    public ParkingAttendant createParkingAttendant(Integer employeeId,String name)
    {
        //        ParkingAttendantRepository.getParkingAttendantRepositoryInstance().addparkingAttendant(newParkingAttendant);
        return ParkingAttendant.builder().employeeId(employeeId).name(name).build();
    }
}
