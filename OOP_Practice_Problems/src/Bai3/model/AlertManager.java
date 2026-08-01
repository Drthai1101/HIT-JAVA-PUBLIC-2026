package Bai3.model;

import Bai3.service.NotificationService;

public class AlertManager {
    private NotificationService notificationService;

    public AlertManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void triggerSecurityAlert(String userId) {
        System.out.println("Cảnh báo có nguy hiểm bảo mật!");
        notificationService.sendNotification("Kenc6r5", "Hệ thống phát hiện nguy hiểm bảo mật!");
    }
}
