package services;

import models.Payment;
import models.Ticket;
import projectenums.PaymentMode;
import projectenums.PaymentStatus;
import repository.PaymentRepository;

import java.time.LocalDateTime;

public class PaymentService {

    public Payment makePayment(PaymentMode paymentMode, Ticket ticket)
    {
        double amount =  new ExitsGateService().calculateAmount(ticket);

        Payment newPayment = Payment.builder().paymentId((int)(Math.random()*100))
                .paymentStatus(PaymentStatus.SUCCESS)
                .paymentMode(paymentMode)
                .time(LocalDateTime.now())
                .amount((int)amount)
                .ticket(ticket)
                .build();
        PaymentRepository.getPaymentRepositoryInstance().savePayment(newPayment);
        if(newPayment.getPaymentStatus().equals(PaymentStatus.SUCCESS))
        {
            new ExitsGateService().unAssignSpot(ticket);
        }
        return newPayment;
    }
}
