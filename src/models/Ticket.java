package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
public class Ticket {
    Integer ticketId;
    LocalDateTime entryTime;
    ParkingSpot assignedParkingSpot;
    Vehicle vehicle;
    Gates issuingGate;


}
