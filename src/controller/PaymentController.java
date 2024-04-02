package controller;

import models.Payment;
import models.Ticket;
import projectenums.PaymentMode;
import services.PaymentService;

public class PaymentController {
    PaymentService paymentService;
    public PaymentController(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }
    public Payment makePayment(PaymentMode paymentMode, Ticket ticket)
    {

        return paymentService.makePayment(paymentMode,ticket);

    }

}
