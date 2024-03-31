package controller;

import models.Payment;
import models.Ticket;
import projectenums.PaymentMode;
import projectenums.PaymentStatus;
import repositries.PaymentRepository;
import services.PaymentService;

import java.time.LocalDateTime;

public class PaymentController {
    public Payment makePayment(PaymentMode paymentMode, Ticket ticket)
    {

        return new PaymentService().makePayment(paymentMode,ticket);

    }

}
