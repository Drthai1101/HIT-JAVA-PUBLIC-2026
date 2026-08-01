package Bai3.app;

import Bai3.model.AlertManager;
import Bai3.model.EmailNotification;
import Bai3.model.SMSNotification;
import Bai3.service.NotificationService;

public class Main {
    public static void main(String[] args) {
        EmailNotification email = new EmailNotification("drthai1101@gmail.com");
        SMSNotification sms = new SMSNotification("030207008050");

        AlertManager emailAlert = new AlertManager(email);
        emailAlert.triggerSecurityAlert("Kenc6r5");

        System.out.println("===========================");

        AlertManager smsAlert = new AlertManager(email);
        smsAlert.triggerSecurityAlert("Kenc6r5");

    }
}
