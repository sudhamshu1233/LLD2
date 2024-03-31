package strategies;

import models.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class CarCostCalculatingStrategy implements CostCalculatingStrategy{

    @Override
    public Double calculateTotalCost(Ticket ticket) {
        LocalDateTime currentTime = LocalDateTime.now();
        double amount = 15;
        long totalTimePassed = currentTime.until(ticket.getEntryTime(), ChronoUnit.HOURS);
        if(totalTimePassed>10)
        {
            amount = 20*totalTimePassed;
        }
        else if(totalTimePassed>0)
        {
            amount = 15*totalTimePassed;
        }
        return amount;

    }
}
