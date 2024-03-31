package services;

import models.ParkingSpot;
import models.Ticket;
import projectenums.ParkingSpotStatus;
import strategies.CostCalculatingFactory;
import strategies.CostCalculatingStrategy;

public class ExitsGateService {
    public Double calculateAmount(Ticket ticket)
    {
        CostCalculatingStrategy strategy = new CostCalculatingFactory().getCostCalculatingStrategy(ticket.getVehicle().getType());
        return strategy.calculateTotalCost(ticket);
    }

    public void unAssignSpot(Ticket ticket)
    {
        ParkingSpot parkingSpot = ticket.getAssignedParkingSpot();
        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
    }
}
