package repository;

import models.Gates;
import models.ParkingAttendant;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    Map<Integer,Gates> gates = new HashMap<>();

    private static GateRepository gateRepositoryInstance = null;

    public static GateRepository getGateRepositoryInstance()
    {
        if(gateRepositoryInstance==null)
        {
            gateRepositoryInstance = new GateRepository();
        }
        return gateRepositoryInstance;
    }
    private GateRepository(){}

    public Gates getGates(Integer Id)
    {

        return gates.get(Id);
    }

    public boolean checkIfParkingAttandantAssigned(ParkingAttendant parkingAttendant)
    {
        for(Gates gate:gates.values())
        {
            if(gate.getParkingAttendant()!=null && gate.getParkingAttendant().equals(parkingAttendant))
            {
                return true;
            }
        }
        return false;
    }
    public void addNewGate(Gates gate)
    {
        gates.put(gate.getId(),gate);
    }
}
