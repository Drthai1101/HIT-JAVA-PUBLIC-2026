package Bai1.model;

public class MomoPayment extends PaymentMethod{
    private String phoneNumber;

    public MomoPayment(String transactionId, String phoneNumber) {
        super(transactionId);
        this.phoneNumber = phoneNumber;
    }
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Đã gửi mã OTP đến " + phoneNumber);
        System.out.println("Vui lòng nhập mã OTP");
        System.out.println("Xác thực thành công đã trừ " + amount + " VND từ ví Momo " + phoneNumber);
        return true;
    }
}
