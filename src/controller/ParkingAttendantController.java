package controller;

import models.ParkingAttendant;
import services.ParkingAttendantService;

public class ParkingAttendantController {

    ParkingAttendantService parkingAttendantService;
    public ParkingAttendantController(ParkingAttendantService parkingAttendantService)
    {
        this.parkingAttendantService = parkingAttendantService;
    }
    public ParkingAttendant createParkingAttendant(Integer employeeId, String name)
    {
        return parkingAttendantService.createParkingAttendant(employeeId,name);
    }
}
