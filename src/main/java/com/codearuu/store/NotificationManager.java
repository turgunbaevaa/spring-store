package com.codearuu.store;

import com.codearuu.store.interfaces.NotificationService;

public class NotificationManager {

    private final NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String recipient, String message) {
        notificationService.send(recipient, message);
    }
}
