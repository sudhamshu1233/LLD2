package services;

import models.Floor;
import models.Gates;
import models.ParkingLot;
import repository.ParkingLotRepositry;

import java.util.List;

public class ParkingLotService {
    public ParkingLot createParkingLot(List<Floor> floors,  String address, List<Gates> gates,Integer id)
    {
        ParkingLot parkingLot = ParkingLot.builder()
                .id(id)
                .gates(gates)
                .address(address)
                .floors(floors)
                .build();
        ParkingLotRepositry.getParkingLotRepositryInstance().createParkingLot(parkingLot);
        return parkingLot;
    }


}
