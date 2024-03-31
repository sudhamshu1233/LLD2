package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import projectenums.VehicleType;

@Setter
@Getter
@Builder
@ToString
public class Vehicle {

    String registerId;
    VehicleType type;


}
