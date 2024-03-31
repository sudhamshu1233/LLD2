package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import models.Floor;
import models.Gates;

import java.util.List;

@Getter
@Setter
@Builder
public class CreateParkingLotRequest {
    List<Floor> floors;

    String name;
    String address;
    List<Gates> gates;
    Integer id;




}
