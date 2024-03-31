package controller;

import dto.IssueTicketRequest;
import dto.IssueTicketResponse;
import models.Ticket;
import services.TicketService;

public class TicketController {

        public IssueTicketResponse generateNewTicket(IssueTicketRequest request)
        {
            Ticket newTicket = new TicketService().generateNewTicket(request.getVehicle(),request.getGate(),request.getParkingLotId());
            IssueTicketResponse issueTicketResponse = new IssueTicketResponse();
            issueTicketResponse.setTicket(newTicket);
            return issueTicketResponse;

        }


}
