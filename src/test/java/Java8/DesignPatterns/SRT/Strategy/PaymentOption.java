package Java8.DesignPatterns.SRT.Strategy;

import java.util.Map;

public interface PaymentOption {

    void enterPaymentInformation(Map<String, String> paymentDetails);
}
