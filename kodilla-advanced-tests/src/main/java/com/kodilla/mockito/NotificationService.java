package com.kodilla.mockito;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;

public class NotificationService {
    private Client client;
    public void addSubscriber(Client client) {
        this.client = client;
    }
    public void sendNotification(Notification notification) {
      this.client.receive(notification);
    }
}
