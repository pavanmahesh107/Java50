package DependencyInjection.UsingClass;

public class ShoppingCart {

    // This field holds a reference to the PaymentService object.
    private PaymentService paymentService;

    public  ShoppingCart(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void checkout(){
        paymentService.processPayment();
        System.out.println("Checkout Completed");
    }
}
