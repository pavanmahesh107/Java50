package DependencyInjection.UsingClass;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new DefaultPaymentService();
        PaymentService creditCradPaymentService = new CreditCardPaymentService();

        ShoppingCart shoppingCart = new ShoppingCart(paymentService);
        shoppingCart.checkout();
        shoppingCart = new ShoppingCart(creditCradPaymentService);
        shoppingCart.checkout();

    }
}
