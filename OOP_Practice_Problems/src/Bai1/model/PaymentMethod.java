package Bai1.model;

public abstract class PaymentMethod {
    private String transactionId;

    public PaymentMethod(String transactionId) {
        setTransactionId(transactionId);
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public abstract boolean processPayment(double amount);
}
