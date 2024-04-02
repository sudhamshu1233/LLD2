package controller;

import dto.IssueTicketRequest;
import dto.IssueTicketResponse;
import models.Ticket;
import services.TicketService;

public class TicketController {
        TicketService ticketService;
        public TicketController(TicketService ticketService)
        {
            this.ticketService = ticketService;
        }
        public IssueTicketResponse generateNewTicket(IssueTicketRequest request)
        {
            Ticket newTicket = ticketService.generateNewTicket(request.getVehicle(),request.getGate(),request.getParkingLotId());
            IssueTicketResponse issueTicketResponse = new IssueTicketResponse();
            issueTicketResponse.setTicket(newTicket);
            return issueTicketResponse;

        }


}
