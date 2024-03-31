package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import models.ParkingSpot;

import java.util.List;

@Getter
@Setter
@Builder
public class FloorCreatorRequest {

    private List<ParkingSpot> parkingSpots;
    Integer floorNumber;
}
