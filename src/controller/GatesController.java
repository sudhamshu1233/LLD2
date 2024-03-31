package controller;

import models.Gates;
import models.ParkingAttendant;
import projectenums.GateType;
import services.GateService;

public class GatesController {
    public Gates createGates(Integer id, GateType gateType)
    {
        return new GateService().createGates(id,gateType);
    }

    public void setParkingAttendantToGate(Integer gateId,ParkingAttendant parkingAttendant)
    {
        new GateService().setParkingAttendantToGate(gateId,parkingAttendant);
    }
}
