package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
public class Invoice {
    private Integer invoiceId;
    private Ticket ticket;
    private Gates exitGate;
    private Payment payment;
    private LocalDateTime exitTime;
}
