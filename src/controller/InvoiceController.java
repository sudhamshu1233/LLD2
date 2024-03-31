package controller;

import dto.InvoiceControllerRequest;
import models.Invoice;
import services.InvoiceService;

public class InvoiceController {
    public Invoice generateInvoice(InvoiceControllerRequest request)
    {
        return new InvoiceService().generateInvoice(request.getExitGate(), request.getPayment());
    }
}
