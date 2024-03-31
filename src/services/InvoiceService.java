package services;

import models.Gates;
import models.Invoice;
import models.Payment;
import repository.InvoiceRepository;

import java.time.LocalDateTime;

public class InvoiceService {
    public Invoice generateInvoice(Gates exitGate, Payment payment)
    {

        Invoice newInvoice = Invoice.builder().invoiceId((int) (Math.random() * 100))
                .exitTime(LocalDateTime.now())
                .exitGate(exitGate)
                .payment(payment)
                .ticket(payment.getTicket())
                .build();
        InvoiceRepository.getInvoiceRepositoryInstance().addInvoice(newInvoice);
        return newInvoice;
    }
}
