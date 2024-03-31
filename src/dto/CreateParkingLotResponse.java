package dto;

import lombok.Getter;
import lombok.Setter;
import models.ParkingLot;

@Getter
@Setter
public class CreateParkingLotResponse {
    ParkingLot parkingLot;
    public CreateParkingLotResponse(ParkingLot parkingLot)
    {
        this.parkingLot = parkingLot;
    }
}
