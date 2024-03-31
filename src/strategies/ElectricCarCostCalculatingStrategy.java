package strategies;

import models.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ElectricCarCostCalculatingStrategy implements CostCalculatingStrategy{
    @Override
    public Double calculateTotalCost(Ticket ticket) {
        LocalDateTime currentTime = LocalDateTime.now();
        double amount = 45;
        long totalTimePassed = currentTime.until(ticket.getEntryTime(), ChronoUnit.HOURS);
        if(totalTimePassed>10)
        {
            amount = 50*totalTimePassed;
        }
        else if(totalTimePassed>0)
        {
            amount = 45*totalTimePassed;
        }
        return amount;

    }
}
