package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherAlertService {

    private Map<Client, Set<String>> clientSubscriptions = new HashMap<>();

    public void subscribe(Client client, String location) {
        clientSubscriptions.computeIfAbsent(client, k -> new HashSet<>()).add(location);
    }

    public void unsubscribe(Client client, String location) {
        if (clientSubscriptions.containsKey(client)) {
            clientSubscriptions.get(client).remove(location);
        }
    }

    public void unsubscribeFromAll(Client client) {
        clientSubscriptions.remove(client);
    }

    public void sendAlert(Notification notification, String location) {
        for (Map.Entry<Client, Set<String>> entry : clientSubscriptions.entrySet()) {
            if (entry.getValue().contains(location)) {
                entry.getKey().receive(notification);
            }
        }
    }

    public void sendAlertToAll(Notification notification) {
        for (Client client : clientSubscriptions.keySet()) {
            client.receive(notification);
        }
    }

    public void deleteLocation(String location) {
        for (Set<String> locations : clientSubscriptions.values()) {
            locations.remove(location);
        }
    }
}
