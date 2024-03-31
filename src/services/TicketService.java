package services;
import models.*;
import projectenums.ParkingSpotStatus;
import projectenums.VehicleType;
import projectexcecption.ParkingSpotFull;
import repositries.ParkingLotRepositry;
import repositries.TicketRepositry;

import java.time.LocalDateTime;
import java.util.List;

public class TicketService {
    public Ticket generateNewTicket(Vehicle vehicle, Gates gate ,Integer parkingLotId)
    {
        double newId = Math.random()*100;
        ParkingSpot assignedParkingSpot = assignParkingSpot(vehicle.getType(),parkingLotId);
        assignedParkingSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        Ticket newTicket = Ticket.builder()
                .ticketId((int) newId)
                .vehicle(vehicle)
                .issuingGate(gate)
                .entryTime(LocalDateTime.now())
                .assignedParkingSpot(assignedParkingSpot)
                .build();

        TicketRepositry.getTicketRepositryInstance().addToTicketRepository(newTicket);
        return newTicket;

    }
    public ParkingSpot assignParkingSpot(VehicleType v,Integer parkingLotId)
    {
        ParkingLot parkingLot = ParkingLotRepositry.getParkingLotRepositryInstance().getParkingLot(parkingLotId);
        List<Floor> floors = parkingLot.getFloors();
        for(Floor floor:floors)
        {
            List<ParkingSpot> parkingSpots = floor.getParkingSpots();
            for(ParkingSpot parkingSpot: parkingSpots)
            {
                if(parkingSpot.getSupportedVehicleType().equals(v) && parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY))
                {
                    return parkingSpot;
                }
            }
        }
        throw new ParkingSpotFull();

    }
}
