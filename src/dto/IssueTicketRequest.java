package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import models.Gates;
import models.ParkingLot;
import models.Vehicle;

@Getter
@Setter
@Builder
public class IssueTicketRequest {
        private Vehicle vehicle;
        private Gates gate;
        private Integer parkingLotId;

}
