package DependencyInjection.UsingClass;

public class DefaultPaymentService implements PaymentService {
    public void processPayment(){
        System.out.println("Processing Payment...");
    }
}
