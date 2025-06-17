package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Model.CardPayment;
import Model.PayPalPayment;
import Exceptions.PaymentFailedException;

public class PaymentProcessTest {

    @Test
    public void testCardPaymentProcessSuccess() {
        CardPayment cardPayment = new CardPayment();
        assertDoesNotThrow(() -> {
            cardPayment.startPayment(100.0);
            cardPayment.process();
        });
    }

    @Test
    public void testCardPaymentWithInvalidAmount() {
        CardPayment cardPayment = new CardPayment();
        assertThrows(PaymentFailedException.class, () -> {
            cardPayment.startPayment(-50.0);
            cardPayment.process();
        });
    }

    @Test
    public void testPayPalPaymentProcessSuccess() {
        PayPalPayment paypal = new PayPalPayment();
        assertDoesNotThrow(() -> {
            paypal.startPayment(150.0);
            paypal.process();
        });
    }

    @Test
    public void testPayPalPaymentWithInvalidAmount() {
        PayPalPayment paypal = new PayPalPayment();
        assertThrows(PaymentFailedException.class, () -> {
            paypal.startPayment(-20.0);
            paypal.process();
        });
    }
}
