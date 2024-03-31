package projectexcecption;

public class PaymentFailed extends RuntimeException{

        public PaymentFailed(String message)
        {
            super(message);
        }
}
