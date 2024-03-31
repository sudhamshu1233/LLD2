package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import projectenums.GateType;

@Getter
@Setter
@Builder
@ToString
public class Gates {
    Integer id;
    GateType gateType;
    ParkingAttendant parkingAttendant;

}
