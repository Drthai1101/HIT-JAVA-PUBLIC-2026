package Bai3.model;

import Bai3.service.NotificationService;

public class SMSNotification implements NotificationService {
    private String apiKey;

    public SMSNotification(String apiKey) {
        setApiKey(apiKey);
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
    @Override
    public void sendNotification(String userId, String message) {
        System.out.println("SMS via Gateway " + apiKey);
        System.out.printf("Gửi tới %s: %s %n", userId, message);
    }
}
