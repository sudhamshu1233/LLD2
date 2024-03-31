package models;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Setter
@Getter
public class ParkingLot {
    private Integer id;
    private String address;
    private List<Floor> floors;
    private List<Gates> gates;




}
