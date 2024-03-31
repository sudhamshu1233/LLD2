package repository;

import models.Invoice;

import java.util.HashMap;
import java.util.Map;

public class InvoiceRepository {

    Map<Integer, Invoice> invoiceRepo =
            new HashMap<>();
    private static InvoiceRepository invoiceRepositoryInstance = null;
    private InvoiceRepository(){}

    public static InvoiceRepository getInvoiceRepositoryInstance()
    {
        if(invoiceRepositoryInstance==null)
        {
            invoiceRepositoryInstance = new InvoiceRepository();
        }
        return invoiceRepositoryInstance;
    }

    public void addInvoice(Invoice invoice)
    {
        invoiceRepo.put(invoice.getInvoiceId(),invoice);
    }

    public Invoice getInvoice(Integer invoiceId)
    {
        return invoiceRepo.get(invoiceId);
    }


}
