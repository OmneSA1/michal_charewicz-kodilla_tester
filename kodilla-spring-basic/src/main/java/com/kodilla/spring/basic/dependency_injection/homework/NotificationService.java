package com.kodilla.spring.basic.dependency_injection.homework;

public class NotificationService implements InterfaceNotificationService {
    public void success(String address) {
        System.out.println("Package delivered to: " + address);
    }

    public void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }
}