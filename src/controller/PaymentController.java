package controller;

import models.Payment;
import models.Ticket;
import projectenums.PaymentMode;
import services.PaymentService;

public class PaymentController {
    public Payment makePayment(PaymentMode paymentMode, Ticket ticket)
    {

        return new PaymentService().makePayment(paymentMode,ticket);

    }

}
