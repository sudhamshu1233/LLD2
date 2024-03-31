package repository;

import models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepositry {
    Map<Integer,Ticket> tickets = new HashMap<>();
    private TicketRepositry()
    {

    }
    private static TicketRepositry ticketRepositryInstance = null;

    public static TicketRepositry getTicketRepositryInstance()
    {
        if(ticketRepositryInstance==null)
        {
            ticketRepositryInstance = new TicketRepositry();
        }
        return ticketRepositryInstance;
    }

    public void addToTicketRepository(Ticket ticket)
    {
        tickets.put(ticket.getTicketId(),ticket);
    }
}
