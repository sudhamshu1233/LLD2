package controller;

import dto.InvoiceControllerRequest;
import models.Invoice;
import services.InvoiceService;

public class InvoiceController {
    InvoiceService invoiceService;
    public InvoiceController(InvoiceService invoiceService)
    {
        this.invoiceService = invoiceService;
    }
    public Invoice generateInvoice(InvoiceControllerRequest request)
    {
        return invoiceService.generateInvoice(request.getExitGate(), request.getPayment());
    }
}
