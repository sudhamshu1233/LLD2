package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Floor {
    Integer floorID;
    List<ParkingSpot> parkingSpots;
    Integer floorNumber;


}
