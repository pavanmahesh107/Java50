package DependencyInjection.UsingClass;

public class CreditCardPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Processing Payment using Credit Card...");
    }
}
