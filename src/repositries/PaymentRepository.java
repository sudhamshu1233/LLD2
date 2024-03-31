package repositries;

import models.Payment;

import java.util.HashMap;
import java.util.Map;

public class PaymentRepository {
    Map<Integer, Payment>paymentMap =
            new HashMap<>();
    private static PaymentRepository paymentRepositoryInstance=null;
    private PaymentRepository(){}
    public static PaymentRepository getPaymentRepositoryInstance()
    {
        if(paymentRepositoryInstance==null)
        {
            paymentRepositoryInstance=new PaymentRepository();
        }
        return paymentRepositoryInstance;
    }

    public void savePayment(Payment payment)
    {
        paymentMap.put(payment.getPaymentId(),payment);
    }
    public Payment getPayment(Integer paymentId)
    {
        return paymentMap.get(paymentId);
    }
}
