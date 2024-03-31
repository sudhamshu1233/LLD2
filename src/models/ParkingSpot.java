package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import projectenums.ParkingSpotStatus;
import projectenums.VehicleType;

@Setter
@Getter
@Builder
@ToString
public class ParkingSpot {
    VehicleType supportedVehicleType;
    Integer floorNumber;
    ParkingSpotStatus parkingSpotStatus;
    Integer spotId;

}
