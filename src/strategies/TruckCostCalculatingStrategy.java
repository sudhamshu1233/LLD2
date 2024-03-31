package strategies;

import models.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TruckCostCalculatingStrategy implements CostCalculatingStrategy{
    @Override
    public Double calculateTotalCost(Ticket ticket) {
        LocalDateTime currentTime = LocalDateTime.now();
        double amount = 70;
        long totalTimePassed = currentTime.until(ticket.getEntryTime(), ChronoUnit.HOURS);
        if(totalTimePassed>10)
        {
            amount = 90*(totalTimePassed-10)+700;
        }
        else if(totalTimePassed>0)
        {
            amount = 70*totalTimePassed;
        }
        return amount;

    }
}
