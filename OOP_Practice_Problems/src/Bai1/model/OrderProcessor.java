package Bai1.model;

public class OrderProcessor {
    public void checkout(PaymentMethod payment, double totalAmount) {
        if (payment.processPayment(totalAmount)) {
            System.out.println("Giao dịch thành công! Mã giao dịch: " + payment.getTransactionId());
        }
        else {
            System.out.println("Giao dịch không thành công!");
        }
    }
}
