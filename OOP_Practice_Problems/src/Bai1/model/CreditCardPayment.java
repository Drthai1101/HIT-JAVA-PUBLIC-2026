package Bai1.model;

public class CreditCardPayment extends PaymentMethod{
    private String cardNumber;
    private String cvv;

    public CreditCardPayment(String transactionId, String cardNumber, String cvv) {
        super(transactionId);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Xác thực thành công!");
        System.out.println("Đã trừ " + amount + " VND từ thẻ " + cardNumber);
        return true;
    }
}
