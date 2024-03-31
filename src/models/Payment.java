package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import projectenums.PaymentMode;
import projectenums.PaymentStatus;

import java.time.LocalDateTime;

@Setter
@Builder
@Getter
@ToString
public class Payment {

    private Integer paymentId;
    private PaymentMode paymentMode;
    private Ticket ticket;
    private PaymentStatus paymentStatus;
    private Integer amount;
    private LocalDateTime time;



}
