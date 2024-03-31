package strategies;

import models.Ticket;

public interface CostCalculatingStrategy {
    public Double calculateTotalCost(Ticket ticket);

}
