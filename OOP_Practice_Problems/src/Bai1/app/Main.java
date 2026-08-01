package Bai1.app;
import Bai1.model.CreditCardPayment;
import Bai1.model.MomoPayment;
import Bai1.model.OrderProcessor;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment credit = new CreditCardPayment("123", "03020700", "541");
        MomoPayment momo = new MomoPayment("234", "0362177888");
        OrderProcessor processor = new OrderProcessor();

        processor.checkout(credit, 500000);
        processor.checkout(momo, 300000);

    }
}