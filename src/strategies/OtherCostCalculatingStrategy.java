package strategies;

import models.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class OtherCostCalculatingStrategy implements CostCalculatingStrategy{

    @Override
    public Double calculateTotalCost(Ticket ticket) {
        LocalDateTime currentTime = LocalDateTime.now();
        double amount = 75;
        long totalTimePassed = currentTime.until(ticket.getEntryTime(), ChronoUnit.HOURS);
        if(totalTimePassed>10)
        {
            amount = 100*(totalTimePassed-10)+1000;
        }
        else if(totalTimePassed>0)
        {
            amount = 75*totalTimePassed;
        }
        return amount;

    }
}
