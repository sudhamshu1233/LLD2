package controller;

import models.ParkingAttendant;
import services.ParkingAttendantService;

public class ParkingAttendantController {
    public ParkingAttendant createParkingAttendant(Integer employeeId, String name)
    {
        return new ParkingAttendantService().createParkingAttendant(employeeId,name);
    }
}
