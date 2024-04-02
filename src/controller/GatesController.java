package controller;

import models.Gates;
import models.ParkingAttendant;
import projectenums.GateType;
import services.GateService;

public class GatesController {
    GateService gateService;
    public GatesController(GateService gateService)
    {
        this.gateService = gateService;
    }
    public Gates createGates(Integer id, GateType gateType)
    {
        return gateService.createGates(id,gateType);
    }

    public void setParkingAttendantToGate(Integer gateId,ParkingAttendant parkingAttendant)
    {
        gateService.setParkingAttendantToGate(gateId,parkingAttendant);
    }
}
