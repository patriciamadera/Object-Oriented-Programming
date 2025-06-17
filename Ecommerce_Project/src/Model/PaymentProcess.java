package Model;
import Exceptions.PaymentFailedException;

public interface PaymentProcess {
    void startPayment(double amount) throws PaymentFailedException;
    boolean verifyPayment();
    void confirmPayment();
}