package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import models.Gates;
import models.ParkingAttendant;
import models.Payment;
import models.Ticket;

@Getter
@Setter
@Builder
public class InvoiceControllerRequest {
    private Gates exitGate;
    private Payment payment;
}
