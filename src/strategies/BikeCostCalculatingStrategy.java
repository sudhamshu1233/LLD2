package strategies;

import models.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class BikeCostCalculatingStrategy implements CostCalculatingStrategy{

    @Override
    public Double calculateTotalCost(Ticket ticket) {
        LocalDateTime currentTime = LocalDateTime.now();
        double amount = 10;
        long totalTimePassed = currentTime.until(ticket.getEntryTime(), ChronoUnit.HOURS);
        System.out.println(totalTimePassed);
        if(totalTimePassed>10)
        {
            amount = 10*totalTimePassed;
        }
        else if(totalTimePassed>0)
        {
            amount = 5*totalTimePassed;
        }
        return amount;

    }
}
