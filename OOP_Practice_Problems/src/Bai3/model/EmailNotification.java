package Bai3.model;

import Bai3.service.NotificationService;

public class EmailNotification implements NotificationService {
    private String senderEmail;

    public EmailNotification(String senderEmail) {
        setSenderEmail(senderEmail);
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }
    @Override
    public void sendNotification(String userId, String message) {
        System.out.println("EMAIL từ " + senderEmail);
        System.out.printf("Gửi tới %s: %s %n", userId, message);
    }
}
