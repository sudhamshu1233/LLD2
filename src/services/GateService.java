package services;

import models.Gates;
import models.ParkingAttendant;
import projectenums.GateType;
import repositries.GateRepository;

public class GateService {
    public Gates createGates(Integer id,GateType gateType)
    {
        Gates newGate = Gates.builder().gateType(gateType).id(id).build();
        GateRepository.getGateRepositoryInstance().addNewGate(newGate);
        return newGate;

    }
    public void setParkingAttendantToGate(Integer gateId,ParkingAttendant parkingAttendant)
    {
        Gates gate = GateRepository.getGateRepositoryInstance().getGates(gateId);
        if(GateRepository.getGateRepositoryInstance().checkIfParkingAttandantAssigned(parkingAttendant))
        {
            throw new RuntimeException("parking attandant already assigned somewhere else");
        }
        gate.setParkingAttendant(parkingAttendant);
    }
}
